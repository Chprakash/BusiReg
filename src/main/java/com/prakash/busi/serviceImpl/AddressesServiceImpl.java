package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AddressDAO;
import com.prakash.busi.dao.AreaDAO;
import com.prakash.busi.dao.CityDAO;
import com.prakash.busi.dao.CountryDAO;
import com.prakash.busi.dao.StateDAO;
import com.prakash.busi.dao.UserDAO;
import com.prakash.busi.dao.ZipDAO;
import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.service.AddressesService;
import com.prakash.busi.util.ModelToDTO;

@Component
public class AddressesServiceImpl implements AddressesService{

	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private CountryDAO countryDAO;
	@Autowired
	private StateDAO stateDAO;
	@Autowired
	private CityDAO cityDAO;
	@Autowired
	private ZipDAO zipDAO;
	@Autowired
	private AreaDAO areaDAO;
	
	@Override
	public AddressesDTO getAddressByID(Long id) {
		return ModelToDTO.tAddressToAddressDTO(addressDAO.getAddressByID(id));
	}

	@Override
	@Transactional
	public AddressesDTO saveAddress(AddressesDTO addressDTO) {
		addressDTO.setCreateddate(new Date());
		addressDTO.setLastupdateddate(new Date());
		TAddresses address=getConvertedToAddresss(addressDTO, new TAddresses());
		address.setTUser(userDAO.getUserByID(addressDTO.getUserId()));
		return ModelToDTO.tAddressToAddressDTO(addressDAO.saveAddress(address));
	}

	@Override
	@Transactional
	public AddressesDTO updateAddress(AddressesDTO addressDTO) {
		addressDTO.setLastupdateddate(new Date());
		TAddresses savedAddress = addressDAO.getAddressByID(addressDTO.getAddressId());
		savedAddress =getConvertedToAddresss(addressDTO,savedAddress);
		return ModelToDTO.tAddressToAddressDTO(addressDAO.updateAddress(savedAddress));
	}
	
	public TAddresses getConvertedToAddresss(AddressesDTO addressDTO, TAddresses tAddress){
		TAddresses address=tAddress;
		if(StringUtils.isNotBlank(addressDTO.getAddress())){
			address.setAddress(addressDTO.getAddress());
		}
		if(StringUtils.isNotBlank(addressDTO.getLandmark())){
			address.setLandmark(addressDTO.getLandmark());
		}
		if(null!=addressDTO.getAddressId()){
			address.setAddressId(addressDTO.getAddressId());
		}
		if(null!=addressDTO.getCityId()){
			address.setLCity(cityDAO.getCityByID(addressDTO.getCityId()));
		}
		if(null!=addressDTO.getCountryId()){
			address.setLCountry(countryDAO.getCountryByID(addressDTO.getCountryId()));
		}
		if(null!=addressDTO.getCreatedby()){
			address.setCreatedby(addressDTO.getCreatedby());
		}
		if(null!=addressDTO.getCreateddate()){
			address.setCreateddate(addressDTO.getCreateddate());
		}
		if(null!=addressDTO.getStateId()){
			address.setLState(stateDAO.getStateByID(addressDTO.getStateId()));
		}
		if(null!=addressDTO.getStatus()){
			address.setStatus(addressDTO.getStatus());
		}
		if(null!=addressDTO.getUpdatedby()){
			address.setUpdatedby(addressDTO.getUpdatedby());
		}
		if(null!=addressDTO.getUserId()){
			address.setTUser(userDAO.getUserByID(addressDTO.getUserId()));
		}
		if(null!=addressDTO.getZipcodeId()){
			address.setLZipcode(zipDAO.getZipByID(addressDTO.getZipcodeId()));
		}
		if(null!=addressDTO.getAreaId()){
			address.setLArea(areaDAO.getAreaByID(addressDTO.getAreaId()));
		}
		
		address.setLastupdateddate(new Date());
		return address;
	
	}

}
