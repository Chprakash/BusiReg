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
	
	@RequestMapping(value = "/address", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody AddressesDTO craeteNewAddress(@RequestBody AddressesDTO addressDTO) {
		return addressService.saveAddress(addressDTO);
	}
	
	@RequestMapping(value = "/address/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody AddressesDTO updateAddress(@PathVariable("id")Long id,@RequestBody AddressesDTO addressDTO) {
		addressDTO.setAddressId(id);
		return addressService.updateAddress(addressDTO);
	}

	@RequestMapping(value="/address/{id}", method = RequestMethod.GET, produces="application/json")
	public AddressesDTO getAddress(@PathVariable("id")Long id) {
		
		return addressService.getAddressByID(id);
	}
}
