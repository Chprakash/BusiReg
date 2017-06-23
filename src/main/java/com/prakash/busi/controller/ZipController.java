package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.ZipDTO;
import com.prakash.busi.service.ZipService;

@RestController
@RequestMapping("/business/registration")
public class ZipController {
	@Autowired
	private ZipService zipService;
	@RequestMapping(value="/zip/{id}", method = RequestMethod.GET, produces="application/json")
	public ZipDTO getZipCode(@PathVariable("id")Long id) {
		return zipService.getZipByID(id);
	}
	
	@RequestMapping(value="/zip", method = RequestMethod.GET, produces="application/json")
	public List<ZipDTO> getAllZip() {
		return zipService.getAllZip();
	}
	
	@RequestMapping(value="/city/{id}/zip", method = RequestMethod.GET, produces="application/json")
	public List<ZipDTO> getAllZipByCityID(@PathVariable("id")Long id) {
		return zipService.getAllZipByCityID(id);
	}
}
