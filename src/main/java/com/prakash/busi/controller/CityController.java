package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.CityDTO;
import com.prakash.busi.service.CityService;

@RestController
@RequestMapping("/business/registration")
public class CityController {
	@Autowired
	private CityService cityService;
	@RequestMapping(value="/city/{id}", method = RequestMethod.GET, produces="application/json")
	public CityDTO getCity(@PathVariable("id")Long id) {
		return cityService.getCityByID(id);
	}
	
	@RequestMapping(value="/city", method = RequestMethod.GET, produces="application/json")
	public List<CityDTO> getAllCities() {
		return cityService.getAllCities();
	}
	
	@RequestMapping(value="/state/{id}/city", method = RequestMethod.GET, produces="application/json")
	public List<CityDTO> getAllCitiesByStateID(@PathVariable("id")Long id) {
		return cityService.getAllCitiesByStateID(id);
	}
}
