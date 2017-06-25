package com.prakash.busi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prakash.busi.dto.BusinesssrcDTO;
import com.prakash.busi.service.BusinessSrcService;

public class BusinessSrcController {
	@Autowired
	private BusinessSrcService businessSrcService;
	
	@RequestMapping(value = "/businessContact", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody BusinesssrcDTO craeteNewBusinessSrc(@RequestBody BusinesssrcDTO businesssrcDTO) {
		return businessSrcService.saveBusinessSrc(businesssrcDTO);
	}
	
	@RequestMapping(value = "/businessContact/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody BusinesssrcDTO updateBusinessSrc(@PathVariable("id")Long id,@RequestBody BusinesssrcDTO businesssrcDTO) {
		businesssrcDTO.setBusiSrcId(id);
		return businessSrcService.updateBusinessSrc(businesssrcDTO);
	}

	@RequestMapping(value="/businessContact/{id}", method = RequestMethod.GET, produces="application/json")
	public BusinesssrcDTO getBusinessSrc(@PathVariable("id")Long id) {
		return businessSrcService.getBusinessSrcByID(id);
	}
}
