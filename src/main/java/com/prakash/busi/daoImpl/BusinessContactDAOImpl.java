package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.BusinessContactDAO;
import com.prakash.busi.model.TBusinesscontact;

@Repository
@Transactional
public class BusinessContactDAOImpl extends AbstractDao<Long, TBusinesscontact> implements BusinessContactDAO{  

	static final Logger logger = LoggerFactory.getLogger(BusinessContactDAOImpl.class); 
	
	@Override
	public TBusinesscontact getContactByID(Long id) {
		logger.info("BusinessContactDAOImpl.getContactByID(...)");
		TBusinesscontact contact = getByKey(id);
		if(contact!=null){
			return contact;
		}
		return null;
	}

	@Override
	public TBusinesscontact saveContact(TBusinesscontact TBusinesscontact) {
		logger.info("BusinessContactDAOImpl.saveContact(...)");
		save(TBusinesscontact);
		return TBusinesscontact;
	}

	@Override
	public TBusinesscontact updateContact(TBusinesscontact TBusinesscontact) {
		// TODO Auto-generated method stub
		return null;
	}

}
