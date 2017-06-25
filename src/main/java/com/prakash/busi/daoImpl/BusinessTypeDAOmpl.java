package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.BusinessTypeDAO;
import com.prakash.busi.model.LBusinesstype;


@Repository
@Transactional
public class BusinessTypeDAOmpl  extends AbstractDao<Long, LBusinesstype> implements BusinessTypeDAO{
	static final Logger logger = LoggerFactory.getLogger(BusinessTypeDAOmpl.class);
	
	@Override
	public LBusinesstype getBusinessTypeByID(Long id) {
		logger.info("BusinessTypeDAOmpl.getBusinessTypeByID(...)");
		LBusinesstype lBusinesstype = getByKey(id);
		if(lBusinesstype!=null){
			return lBusinesstype;
		}
		return null;
	}

	@Override
	public LBusinesstype saveBusinessType(LBusinesstype lBusinesstype) {
		logger.info("BusinessTypeDAOmpl.saveBusinessType(...)");
		save(lBusinesstype);
		return lBusinesstype;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LBusinesstype> getAllBusinessType() {
		logger.info("BusinessTypeDAOmpl.getAllBusinessType(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		List<LBusinesstype> lBusinesstypeList = (List<LBusinesstype>) criteria.list();
		return lBusinesstypeList;
	}

}
