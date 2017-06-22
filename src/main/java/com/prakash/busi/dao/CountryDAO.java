package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LCountry;

public interface CountryDAO {
	public LCountry getCountryByID(Long id);
	public List<LCountry> getAllCountries();
}
