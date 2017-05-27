package com.prakash.busi.util;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.model.TTempClient;
import com.prakash.busi.model.TUser;

public class DTOToModel {
	
	public static TAddresses addressDTOToAddresss(AddressesDTO addressDTO){
		TAddresses address=new TAddresses();
		address.setAddress(addressDTO.getAddress());
		address.setAddressId(addressDTO.getAddressId());
		address.setCityid(addressDTO.getCityid());
		address.setCountryid(addressDTO.getCountryid());
		address.setCreatedby(addressDTO.getCreatedby());
		address.setCreateddate(addressDTO.getCreateddate());
		address.setLandmark(addressDTO.getLandmark());
		address.setLastupdateddate(addressDTO.getLastupdateddate());
		address.setStateid(addressDTO.getStateid());
		address.setStatus(addressDTO.getStatus());
		address.setUpdatedby(addressDTO.getUpdatedby());
		address.setZipcode(addressDTO.getZipcode());
		return address;
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
	
	public static TUser TempClientDTOToTuser(TempClientDTO tempClientDTO){
		TUser user=new TUser();
		user.setFirstName(tempClientDTO.getFirstName());
		user.setMiddleName(tempClientDTO.getMiddleName());
		user.setLastName(tempClientDTO.getLastName());
		user.setEmailId(tempClientDTO.getEmailId());
		user.setPassword(tempClientDTO.getPassword());
		user.setCreatedBy(tempClientDTO.getCreatedBy());
		user.setCreatedDate(tempClientDTO.getCreatedDate());
		user.setDob(tempClientDTO.getBirthday());
		user.setLastUpdatedDate(tempClientDTO.getLastUpdatedDate());
		user.setActive(false);
		user.setLastUpdatedDate(tempClientDTO.getCreatedDate());
		user.setUpdatedBy(tempClientDTO.getCreatedBy());
		user.setLocked(false);
		return user;
		
	}
}
