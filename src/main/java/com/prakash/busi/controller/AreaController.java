package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.AreaDTO;
import com.prakash.busi.service.AreaService;

@RestController
@RequestMapping("/business/registration")
public class AreaController {
	@Autowired
	private AreaService areaService;
	@RequestMapping(value="/area/{id}", method = RequestMethod.GET, produces="application/json")
	public AreaDTO getAreaByID(@PathVariable("id")Long id) {
		return areaService.getAreaByID(id);
	}
	
	@RequestMapping(value="/area", method = RequestMethod.GET, produces="application/json")
	public List<AreaDTO> getAllArea() {
		return areaService.getAllArea();
	}
	
	@RequestMapping(value="/zip/{id}/area", method = RequestMethod.GET, produces="application/json")
	public List<AreaDTO> getAllAreaByZipID(@PathVariable("id")Long id) {
		return areaService.getAllAreaByZipID(id);
	}
}
