package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.CityDAO;
import com.prakash.busi.dto.CityDTO;
import com.prakash.busi.model.LCity;
import com.prakash.busi.service.CityService;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDAO cityDAO;
	
	@Override
	public CityDTO getCityByID(Long id) {
		return ModelToDTO.LCityToCityDTO(cityDAO.getCityByID(id));
	}

	@Override
	public List<CityDTO> getAllCities() {
		List<LCity> cities= cityDAO.getAllCities();
		List<CityDTO> cityDTO=new ArrayList<CityDTO>();
		for (LCity lCities : cities) {
			cityDTO.add(ModelToDTO.LCityToCityDTO(lCities));
		}
		return cityDTO;
	}

	@Override
	public List<CityDTO> getAllCitiesByStateID(Long id) {
		List<LCity> cities= cityDAO.getAllCitiesByStateID(id);
		List<CityDTO> cityDTO=new ArrayList<CityDTO>();
		for (LCity lCities : cities) {
			cityDTO.add(ModelToDTO.LCityToCityDTO(lCities));
		}
		return cityDTO;
	}

}
