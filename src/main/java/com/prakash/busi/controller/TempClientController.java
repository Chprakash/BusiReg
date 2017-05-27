package com.prakash.busi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.service.TempClientService;

@RestController
@RequestMapping("/business/registration")
public class TempClientController {
	
	@Autowired
	private TempClientService tempClientService;
	
	@RequestMapping(value = "/tempuser", method = RequestMethod.POST,  consumes="application/json", produces="application/json")
	public @ResponseBody TempClientDTO registerBusinessTempUser(@RequestBody TempClientDTO tempClientDTO) {

		return tempClientService.saveTempClient(tempClientDTO);
	}
	
	@RequestMapping(value = "/tempuser/{id}", method = RequestMethod.PUT,  consumes="application/json", produces="application/json")
	public @ResponseBody TempClientDTO updateBusinessTempUser(@PathVariable("id")Long id,@RequestBody TempClientDTO tempClientDTO) {
		
		tempClientDTO.setId(id);
		return tempClientService.updateTempClient(tempClientDTO);
	}

	@RequestMapping(value="/tempuser/{id}", method = RequestMethod.GET, produces="application/json")
	public TempClientDTO getBusi(@PathVariable("id")Long id) {
		return tempClientService.getTempClientByID(id);
	}
}
