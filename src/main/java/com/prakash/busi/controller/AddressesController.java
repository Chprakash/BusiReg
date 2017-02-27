package com.prakash.busi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.service.AddressesService;

@RestController
@RequestMapping("/business/registration")
public class AddressesController {
	@Autowired
	private AddressesService addressService;
	
	@RequestMapping(value = "/Address", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody AddressesDTO craeteNewAddress(@RequestBody AddressesDTO addressDTO) {
		addressDTO.setCreateddate(new Date());
		addressDTO.setLastupdateddate(new Date());
		return addressService.saveAddress(addressDTO);
	}
	
/*	@RequestMapping(value = "/Address", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody AddressesDTO updateBusinessTempUser(@RequestBody AddressesDTO tempClientDTO) {
		tempClientDTO.setLastUpdatedDate(new Date());
		return tempClientService.updateTempClient(tempClientDTO);
	}*/

	@RequestMapping(value="/Address/{id}", method = RequestMethod.GET, produces="application/json")
	public AddressesDTO getAddress(@PathVariable("id")Long id) {
		return addressService.getAddressByID(id);
	}
}
