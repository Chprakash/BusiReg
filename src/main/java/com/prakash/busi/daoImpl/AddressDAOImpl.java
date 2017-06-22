package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.AddressDAO;
import com.prakash.busi.model.TAddresses;

@Repository
@Transactional
public class AddressDAOImpl extends AbstractDao<Long, TAddresses> implements AddressDAO{

	static final Logger logger = LoggerFactory.getLogger(AddressDAOImpl.class);
	@Override
	public TAddresses getAddressByID(Long id) {
		logger.info("AddressDAOImpl.getAddressByID(...)");
		TAddresses address = getByKey(id);
		if(address!=null){
			return address;
		}
		return null;
	}
	@Override
	@Transactional
	public TAddresses saveAddress(TAddresses address) {
		logger.info("AddressDAOImpl.saveAddress(...)");
		save(address);
		return address;
	}
	@Override
	@Transactional
	public TAddresses updateAddress(TAddresses address) {
		logger.info("AddressDAOImpl.updateAddress(...)");
		address.setVersion(0);
		update(address);
		return address;
	}
}
