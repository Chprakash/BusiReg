package com.prakash.busi.util;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.model.TTempClient;

public class DTOToModel {
	public static AddressesDTO addressDTOToAddresss(TAddresses address){
		AddressesDTO addressDTO=new AddressesDTO();
		addressDTO.setAddress(address.getAddress());
		addressDTO.setAddressId(address.getAddressId());
		addressDTO.setCityid(address.getCityid());
		addressDTO.setCountryid(address.getCountryid());
		addressDTO.setCreatedby(address.getCreatedby());
		addressDTO.setCreateddate(address.getCreateddate());
		addressDTO.setLandmark(address.getLandmark());
		addressDTO.setLastupdateddate(address.getLastupdateddate());
		addressDTO.setStateid(address.getStateid());
		addressDTO.setStatus(address.getStatus());
		addressDTO.setUpdatedby(address.getUpdatedby());
		addressDTO.setZipcode(address.getZipcode());
		addressDTO.setUserId(address.getTUser().getId());
		return addressDTO;
	}
	
	public static TTempClient TempClientDTOToTempClient(TempClientDTO tempClientDTO){
		TTempClient tempclient=new TTempClient();
		tempclient.setId(tempClientDTO.getId());
		tempclient.setActive(tempClientDTO.getActive());
		tempclient.setBirthday(tempClientDTO.getBirthday());
		tempclient.setCreatedBy(tempClientDTO.getCreatedBy());
		tempclient.setCreatedDate(tempClientDTO.getCreatedDate());
		tempclient.setEmailId(tempClientDTO.getEmailId());
		tempclient.setFirstName(tempClientDTO.getFirstName());
		tempclient.setId(tempClientDTO.getId());
		tempclient.setLastName(tempClientDTO.getLastName());
		tempclient.setMiddleName(tempClientDTO.getMiddleName());
		tempclient.setMobile(tempClientDTO.getMobile());
		tempclient.setPassword(tempClientDTO.getPassword());
		tempclient.setLastUpdatedDate(tempClientDTO.getLastUpdatedDate());
		return tempclient;
		
	}

}
