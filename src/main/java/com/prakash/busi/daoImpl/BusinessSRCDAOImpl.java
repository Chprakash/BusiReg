package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.BusinessSRCDAO;
import com.prakash.busi.model.TBusinesscontact;
import com.prakash.busi.model.TBusinesssrc;

@Repository
@Transactional
public class BusinessSRCDAOImpl extends AbstractDao<Long, TBusinesssrc> implements BusinessSRCDAO{
	static final Logger logger = LoggerFactory.getLogger(BusinessSRCDAOImpl.class);

	@Override
	public TBusinesssrc getBusinessSrcByID(Long id) {
		logger.info("BusinessSRCDAOImpl.getBusinessSrcByID(...)");
		TBusinesssrc businessSRC = getByKey(id);
		if(businessSRC!=null){
			return businessSRC;
		}
		return null;
	}

	@Override
	public TBusinesssrc saveBusinessSrc(TBusinesssrc address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TBusinesssrc updateBusinessSrc(TBusinesssrc address) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
