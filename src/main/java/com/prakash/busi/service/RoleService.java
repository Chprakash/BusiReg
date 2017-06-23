package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.RoleDTO;


public interface RoleService {
	public List<RoleDTO> getRoleList();
	public RoleDTO saveRole(RoleDTO roleDTO);
	public RoleDTO updateRole(RoleDTO roleDTO);
	public RoleDTO getRoleByID(Long id);
}
