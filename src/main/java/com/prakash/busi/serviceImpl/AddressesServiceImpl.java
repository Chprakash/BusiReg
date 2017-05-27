package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AddressDAO;
import com.prakash.busi.dao.UserDAO;
import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.service.AddressesService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
public class AddressesServiceImpl implements AddressesService{

	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public AddressesDTO getAddressByID(Long id) {
		return ModelToDTO.tAddressToAddressDTO(addressDAO.getAddressByID(id));
	}

	@Override
	@Transactional
	public AddressesDTO saveAddress(AddressesDTO addressDTO) {
		addressDTO.setCreateddate(new Date());
		addressDTO.setLastupdateddate(new Date());
		TAddresses address=DTOToModel.addressDTOToAddresss(addressDTO);
		address.setTUser(userDAO.getUserByID(addressDTO.getUserId()));
		return ModelToDTO.tAddressToAddressDTO(addressDAO.saveAddress(address));
	}

	@Override
	@Transactional
	public AddressesDTO updateAddress(AddressesDTO addressDTO) {
		addressDTO.setLastupdateddate(new Date());
		TAddresses savedAddress = addressDAO.getAddressByID(addressDTO.getAddressId());
		
		if(StringUtils.isNotBlank(addressDTO.getAddress())){
			savedAddress.setAddress(addressDTO.getAddress());
		}
		if(StringUtils.isNotBlank(addressDTO.getLandmark())){
			savedAddress.setLandmark(addressDTO.getLandmark());
		}
		if(null!=addressDTO.getAddressId()){
			savedAddress.setAddressId(addressDTO.getAddressId());
		}
		if(null!=addressDTO.getCityid()){
			savedAddress.setCityid(addressDTO.getCityid());
		}
		if(null!=addressDTO.getCountryid()){
			savedAddress.setCityid(addressDTO.getCountryid());
		}
		if(null!=addressDTO.getCreatedby()){
			savedAddress.setCityid(addressDTO.getCreatedby());
		}
		if(null!=addressDTO.getStateid()){
			savedAddress.setCityid(addressDTO.getStateid());
		}
		if(null!=addressDTO.getStatus()){
			savedAddress.setCityid(addressDTO.getStatus());
		}
		if(null!=addressDTO.getUpdatedby()){
			savedAddress.setUpdatedby(addressDTO.getUpdatedby());
		}
		if(null!=addressDTO.getUserId()){
			savedAddress.setTUser(userDAO.getUserByID(addressDTO.getUserId()));
		}
		if(null!=addressDTO.getZipcode()){
			savedAddress.setZipcode(addressDTO.getZipcode());
		}
		savedAddress.setLastupdateddate(new Date());
		
		return ModelToDTO.tAddressToAddressDTO(addressDAO.updateAddress(savedAddress));
	}

}
