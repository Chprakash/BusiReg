package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.LRole;
import com.prakash.busi.service.RoleService;

@RestController
@RequestMapping("/business/registration")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/role", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody RoleDTO craeteNewRole(@RequestBody RoleDTO roleDTO) {
		return roleService.saveRole(roleDTO);
	}
	
	@RequestMapping(value = "/role/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody RoleDTO updateRole(@PathVariable("id")Long id,@RequestBody RoleDTO roleDTO) {
		roleDTO.setId(id);
		return roleService.updateRole(roleDTO);
	}

	@RequestMapping(value="/role/{id}", method = RequestMethod.GET, produces="application/json")
	public RoleDTO getRole(@PathVariable("id")Long id) {
		return roleService.getRoleByID(id);
	}
	
	@RequestMapping(value="/role", method = RequestMethod.GET, produces="application/json")
	public List<RoleDTO> getAllRoles() {
		return roleService.getRoleList();
	}
}
