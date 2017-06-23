package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.CityDTO;

public interface CityService {
	public CityDTO getCityByID(Long id);
	public List<CityDTO> getAllCities();
	public List<CityDTO> getAllCitiesByStateID(Long id);
}
