package com.prakash.busi.service;

import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.TUser;

public interface UserService {
	public TUser saveUser(TempClientDTO tempClientDTO);
}
