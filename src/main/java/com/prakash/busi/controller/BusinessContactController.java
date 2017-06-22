package com.prakash.busi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.BusinesscontactDTO;
import com.prakash.busi.service.BusinessContactService;

@RestController
@RequestMapping("/business/registration")
public class BusinessContactController {
	@Autowired
	private BusinessContactService businessContactService;
	
	@RequestMapping(value = "/businessContact", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody BusinesscontactDTO craeteNewContact(@RequestBody BusinesscontactDTO businesscontactDTO) {
		return businessContactService.saveContact(businesscontactDTO);
	}
	
	@RequestMapping(value = "/businessContact/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody BusinesscontactDTO updateContact(@PathVariable("id")Long id,@RequestBody BusinesscontactDTO businesscontactDTO) {
		businesscontactDTO.setContactid(id);
		return businessContactService.updateContact(businesscontactDTO);
	}

	@RequestMapping(value="/businessContact/{id}", method = RequestMethod.GET, produces="application/json")
	public BusinesscontactDTO getContact(@PathVariable("id")Long id) {
		return businessContactService.getContactByID(id);
	}
}
