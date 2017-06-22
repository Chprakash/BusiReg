package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.CountryDTO;

public interface CountryService {
	public CountryDTO getCountryByID(Long id);
	public List<CountryDTO> getAllCountries();
}
