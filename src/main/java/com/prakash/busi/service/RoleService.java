package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.model.LRole;


public interface RoleService {
	public List<RoleDTO> getRoleList();
	public RoleDTO saveRole(RoleDTO roleDTO);
	public RoleDTO updateRole(RoleDTO roleDTO);
	public RoleDTO getRoleByID(Long id);
}
