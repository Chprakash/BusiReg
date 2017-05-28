package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.RoleDAO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.model.LRole;
import com.prakash.busi.service.RoleService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Transactional
@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAO roleDAO;
	
	@Override
	public List<RoleDTO> getRoleList() {
		List<LRole> roleList=roleDAO.getRoleList();
		Iterator<LRole> roles= roleList.iterator();
		List<RoleDTO> roleDTOList=new ArrayList<RoleDTO>();
		while(roles.hasNext())
		{
			roleDTOList.add(ModelToDTO.roleToRoleDTO(roles.next()));
		}
		return roleDTOList;
	}

	@Override
	public RoleDTO saveRole(RoleDTO roleDTO) {
		return ModelToDTO.roleToRoleDTO(roleDAO.saveRole(DTOToModel.RoleDTOToLRole(roleDTO)));
	}

	@Override
	public RoleDTO getRoleByID(Long id) {
		LRole role= roleDAO.getRoleByID(id);
		return ModelToDTO.roleToRoleDTO(role);
	}

	@Override
	public RoleDTO updateRole(RoleDTO roleDTO) {
		LRole role=roleDAO.getRoleByID(roleDTO.getId());
		if(null!=roleDTO.getType()){
			role.setType(roleDTO.getType());
		}
		return ModelToDTO.roleToRoleDTO(roleDAO.updateRole(role));
	}

}
