package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.StateDAO;
import com.prakash.busi.model.LState;

@Repository
@Transactional
public class StateDAOImpl extends AbstractDao<Long, LState> implements StateDAO{

	static final Logger logger = LoggerFactory.getLogger(StateDAOImpl.class);
	@Override
	public LState getStateByID(Long id) {
		logger.info("StateDAOImpl.getStateByID(...)");
		LState state = getByKey(id);
		if(state!=null){
			return state;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LState> getAllStates() {
		logger.info("StateDAOImpl.getAllStates(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LState> stateList = (List<LState>) criteria.list();
		return stateList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<LState> getAllStatesByCountryID(Long id) {
		logger.info("StateDAOImpl.getAllStatesByCountryID(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.add(Restrictions.eq("LCountry.countryid", id));
		List<LState> stateList = (List<LState>) criteria.list();
		return stateList;
	}

}
