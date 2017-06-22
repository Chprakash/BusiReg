package com.prakash.busi.dao;

import com.prakash.busi.model.TUser;

public interface UserDAO {
	public TUser getUserByID(Long id);
	public TUser saveUser(TUser user);
	public TUser updateUser(TUser user);
}
