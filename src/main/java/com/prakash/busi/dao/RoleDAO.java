package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LRole;

public interface RoleDAO {
	public List<LRole> getRoleList();
	public LRole saveRole(LRole role);
	public LRole updateRole(LRole role);
	public LRole getRoleByID(Long id);
}
