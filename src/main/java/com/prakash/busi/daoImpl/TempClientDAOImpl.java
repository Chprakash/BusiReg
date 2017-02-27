package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.TempClientDAO;
import com.prakash.busi.model.TTempClient;

@Repository
public class TempClientDAOImpl extends AbstractDao<Long, TTempClient> implements TempClientDAO{

	static final Logger logger = LoggerFactory.getLogger(TempClientDAOImpl.class);
	@Override
	@Transactional
	public TTempClient getTempClientByID(Long id) {
		logger.info("TempClientDAOImpl.getTempClientByID(...)");
		TTempClient tempClient = getByKey(id);
		if(tempClient!=null){
			return tempClient;
		}
		return null;
	}
	
	@Override
	@Transactional
	public TTempClient saveTempClient(TTempClient tempClient) {
		logger.info("TempClientDAOImpl.saveOrUpdateTempClient(...)");
		save(tempClient);
		return tempClient;
	}

	@Override
	@Transactional
	public TTempClient updateTempClient(TTempClient tempClient) {
		logger.info("TempClientDAOImpl.updateTempClient(...)");
		update(tempClient);
		return tempClient;
	}

}
