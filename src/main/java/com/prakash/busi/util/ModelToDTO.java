package com.prakash.busi.util;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.BusinesscontactDTO;
import com.prakash.busi.dto.CountryDTO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.LCountry;
import com.prakash.busi.model.LRole;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.model.TBusinesscontact;
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
		addressDTO.setCityId(address.getLCity().getCityid());
		addressDTO.setCountryId(address.getLCountry().getCountryid());
		addressDTO.setCreatedby(address.getCreatedby());
		addressDTO.setCreateddate(address.getCreateddate());
		addressDTO.setLandmark(address.getLandmark());
		addressDTO.setLastupdateddate(address.getLastupdateddate());
		addressDTO.setStateId(address.getLState().getStateId());
		addressDTO.setStatus(address.getStatus());
		addressDTO.setUpdatedby(address.getUpdatedby());
		addressDTO.setAreaId(address.getLArea().getAreaid());
		if(address.getTUser()!=null)
			addressDTO.setUserId(address.getTUser().getId());
		addressDTO.setZipcodeId(address.getLZipcode().getZipid());
		return addressDTO;
		
	}
	
	public static RoleDTO roleToRoleDTO(LRole role)
	{
		RoleDTO roleDTO = new RoleDTO();
		roleDTO.setId(role.getId());
		roleDTO.setType(role.getType());
		return roleDTO;
	}
	
	public static BusinesscontactDTO TBusinessContactToBusinesscontactDTO(TBusinesscontact businessContact){
		BusinesscontactDTO businesscontactDTO = new BusinesscontactDTO();
		businesscontactDTO.setAreaCode(businessContact.getAreaCode());
		businesscontactDTO.setContactid(businessContact.getContactid());
		businesscontactDTO.setContactPersonFName(businessContact.getContactPersonFName());
		businesscontactDTO.setContactPersonLName(businessContact.getContactPersonLName());
		businesscontactDTO.setContactPersonMName(businessContact.getContactPersonMName());
		businesscontactDTO.setCountryCode(businessContact.getLCountry().getCountryCode());
		businesscontactDTO.setCreatedBy(businessContact.getCreatedBy());
		businesscontactDTO.setUpdatedBy(businessContact.getUpdatedBy());
		businesscontactDTO.setCreatedDate(businessContact.getCreatedDate());
		businesscontactDTO.setEmailId1(businessContact.getEmailId1());
		businesscontactDTO.setEmailId2(businessContact.getEmailId2());
		businesscontactDTO.setLandLineNo(businessContact.getLandLineNo());
		businesscontactDTO.setLastUpdateddate(businessContact.getLastUpdateddate());
		businesscontactDTO.setBusinesssrcID(businessContact.getContactid());
		businesscontactDTO.setPhoneNo(businessContact.getPhoneNo());
		businesscontactDTO.setMobileNo1(businessContact.getMobileNo1());
		businesscontactDTO.setMobileNo2(businessContact.getMobileNo2());
		
		return businesscontactDTO;
	}
	
	public static CountryDTO LCountryToCountryDTO(LCountry country){
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCountryid(country.getCountryid());
		countryDTO.setCountryname(country.getCountryname());
		countryDTO.setStatus(country.getStatus());
		return countryDTO;
	}
}
