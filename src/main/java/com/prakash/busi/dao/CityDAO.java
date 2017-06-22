package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LCity;

public interface CityDAO {
	public LCity getCityByID(Long id);
	public List<LCity> getAllCities();
	public List<LCity> getAllCitiesByStateID(Long id);
}
