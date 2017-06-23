package com.prakash.busi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.busi.dto.StateDTO;
import com.prakash.busi.service.StateService;

@RestController
@RequestMapping("/business/registration")
public class StateController {
	@Autowired
	private StateService stateService;
	@RequestMapping(value="/state/{id}", method = RequestMethod.GET, produces="application/json")
	public StateDTO getState(@PathVariable("id")Long id) {
		return stateService.getStateByID(id);
	}
	
	@RequestMapping(value="/state", method = RequestMethod.GET, produces="application/json")
	public List<StateDTO> getAllStates() {
		return stateService.getAllStates();
	}
	
	@RequestMapping(value="/country/{id}/state", method = RequestMethod.GET, produces="application/json")
	public List<StateDTO> getAllStatesByCountryID(@PathVariable("id")Long id) {
		return stateService.getStateByCountryID(id);
	}
}
