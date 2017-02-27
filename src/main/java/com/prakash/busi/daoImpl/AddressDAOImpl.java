package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.AddressDAO;
import com.prakash.busi.model.TAddresses;

@Repository
public class AddressDAOImpl extends AbstractDao<Long, TAddresses> implements AddressDAO{

	static final Logger logger = LoggerFactory.getLogger(TempClientDAOImpl.class);
	@Override
	@Transactional
	public TAddresses getAddressByID(Long id) {
		logger.info("AddressDAOImpl.getAddressByID(...)");
		TAddresses address = getByKey(id);
		if(address!=null){
			return address;
		}
		return null;
	}
	@Override
	public TAddresses saveAddress(TAddresses address) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TAddresses updateAddress(TAddresses address) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
