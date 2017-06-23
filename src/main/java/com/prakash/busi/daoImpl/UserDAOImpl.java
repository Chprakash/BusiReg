package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.UserDAO;
import com.prakash.busi.model.TUser;

@Repository
public class UserDAOImpl extends AbstractDao<Long, TUser> implements UserDAO {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Override
	@Transactional
	public TUser getUserByID(Long id) {
		logger.info("UserDAOImpl.getUserByID(...)");
		TUser uesr = getByKey(id);
		if(uesr!=null){
			return uesr;
		}
		return null;
	}

	@Override
	public TUser saveUser(TUser user) {
		logger.info("UserDAOImpl.saveUser(...)");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		save(user);
		return user;
	}

	@Override
	public TUser updateUser(TUser user) {
		// TODO Auto-generated method stub
		return null;
	}

}
