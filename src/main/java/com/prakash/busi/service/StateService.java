package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.StateDTO;

public interface StateService {
	public StateDTO getStateByID(Long id);
	public List<StateDTO> getAllStates();
	public List<StateDTO> getStateByCountryID(Long id);
}
