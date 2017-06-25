package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.BusinessTypeDTO;
import com.prakash.busi.service.BusinessTypeService;

@RestController
@RequestMapping("/business/registration")
public class BusinessTypeController {
	@Autowired
	private BusinessTypeService businessTypeService;
	
	@RequestMapping(value = "/businessType", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody BusinessTypeDTO craeteNewBussinessType(@RequestBody BusinessTypeDTO businessTypeDTO) {
		return businessTypeService.saveBusinessType(businessTypeDTO);
	}
	
	@RequestMapping(value = "/businessType", method = RequestMethod.GET,  consumes="application/json", produces="application/json")
	public @ResponseBody List<BusinessTypeDTO> getAllBusinessType() {
		return businessTypeService.getAllBusinessTypes();
	}

	@RequestMapping(value="/businessType/{id}", method = RequestMethod.GET, produces="application/json")
	public BusinessTypeDTO getBusinessTypeByID(@PathVariable("id")Long id) {
		
		return businessTypeService.getBusinessTypeByID(id);
	}
}
