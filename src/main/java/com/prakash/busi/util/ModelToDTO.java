package com.prakash.busi.util;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.LRole;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.model.TTempClient;

public class ModelToDTO {

	public static TempClientDTO tTempClientToTempClientDTO(TTempClient tempClient){
		TempClientDTO tempclientDTO=new TempClientDTO();
		tempclientDTO.setActive(tempClient.getActive());
		tempclientDTO.setBirthday(tempClient.getBirthday());
		tempclientDTO.setCreatedBy(tempClient.getCreatedBy());
		tempclientDTO.setCreatedDate(tempClient.getCreatedDate());
		tempclientDTO.setEmailId(tempClient.getEmailId());
		tempclientDTO.setFirstName(tempClient.getFirstName());
		tempclientDTO.setId(tempClient.getId());
		tempclientDTO.setLastName(tempClient.getLastName());
		tempclientDTO.setMiddleName(tempClient.getMiddleName());
		tempclientDTO.setMobile(tempClient.getMobile());
		tempclientDTO.setPassword(tempClient.getPassword());
		tempclientDTO.setLastUpdatedDate(tempClient.getLastUpdatedDate());
		return tempclientDTO;
		
	}
	public static AddressesDTO tAddressToAddressDTO(TAddresses address){
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
		addressDTO.setStateid(address.getStateid());
		addressDTO.setUpdatedby(address.getUpdatedby());
		if(address.getTUser()!=null)
			addressDTO.setUserId(address.getTUser().getId());
		addressDTO.setZipcode(address.getZipcode());
		return addressDTO;
		
	}
	
	public static RoleDTO roleToRoleDTO(LRole role)
	{
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setId(role.getId());
		roleDTO.setType(role.getType());
		return roleDTO;
	}
}
