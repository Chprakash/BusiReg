package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.CountryDAO;
import com.prakash.busi.dto.CountryDTO;
import com.prakash.busi.model.LCountry;
import com.prakash.busi.service.CountryService;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDAO countryDAO;
	
	@Override
	public CountryDTO getCountryByID(Long id) {
		return ModelToDTO.LCountryToCountryDTO(countryDAO.getCountryByID(id));
	}

	@Override
	public List<CountryDTO> getAllCountries() {
		List<LCountry> countries= countryDAO.getAllCountries();
		List<CountryDTO> countriesDTO=new ArrayList<CountryDTO>();
		for (LCountry lCountry : countries) {
			countriesDTO.add(ModelToDTO.LCountryToCountryDTO(lCountry));
		}
		return countriesDTO;
	}

}
