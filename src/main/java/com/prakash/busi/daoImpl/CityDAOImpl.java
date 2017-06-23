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
import com.prakash.busi.dao.CityDAO;
import com.prakash.busi.model.LCity;

@Repository
@Transactional
public class CityDAOImpl extends AbstractDao<Long, LCity> implements CityDAO{

	static final Logger logger = LoggerFactory.getLogger(CityDAOImpl.class);
	
	@Override
	public LCity getCityByID(Long id) {
		logger.info("CityDAOImpl.getCityByID(...)");
		LCity city = getByKey(id);
		if(city!=null){
			return city;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LCity> getAllCities() {
		logger.info("CityDAOImpl.getAllCities(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LCity> cityList = (List<LCity>) criteria.list();
		return cityList;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<LCity> getAllCitiesByStateID(Long id) {
		logger.info("CityDAOImpl.getAllCitiesByStateID(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.add(Restrictions.eq("LState.stateId", id));
		List<LCity> cityList = (List<LCity>) criteria.list();
		return cityList;
	}

}
