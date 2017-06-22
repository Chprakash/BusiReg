package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.CountryDTO;
import com.prakash.busi.service.CountryService;

@RestController
@RequestMapping("/business/registration")
public class CountryController {
	@Autowired
	private CountryService countryService;
	@RequestMapping(value="/country/{id}", method = RequestMethod.GET, produces="application/json")
	public CountryDTO getCountry(@PathVariable("id")Long id) {
		return countryService.getCountryByID(id);
	}
	
	@RequestMapping(value="/country", method = RequestMethod.GET, produces="application/json")
	public List<CountryDTO> getAllCountries() {
		return countryService.getAllCountries();
	}
}
