package com.prakash.busi.util;

import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.dto.AreaDTO;
import com.prakash.busi.dto.BusinessTypeDTO;
import com.prakash.busi.dto.BusinesscontactDTO;
import com.prakash.busi.dto.BusinesssrcDTO;
import com.prakash.busi.dto.CityDTO;
import com.prakash.busi.dto.CountryDTO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.dto.StateDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.dto.ZipDTO;
import com.prakash.busi.model.LArea;
import com.prakash.busi.model.LBusinesstype;
import com.prakash.busi.model.LCity;
import com.prakash.busi.model.LCountry;
import com.prakash.busi.model.LRole;
import com.prakash.busi.model.LState;
import com.prakash.busi.model.LZipcode;
import com.prakash.busi.model.TAddresses;
import com.prakash.busi.model.TBusinesscontact;
import com.prakash.busi.model.TBusinesssrc;
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
		businesscontactDTO.setCountryId(businessContact.getLCountry().getCountryid());
		businesscontactDTO.setCreatedBy(businessContact.getCreatedBy());
		businesscontactDTO.setUpdatedBy(businessContact.getUpdatedBy());
		businesscontactDTO.setCreatedDate(businessContact.getCreatedDate());
		businesscontactDTO.setEmailId1(businessContact.getEmailId1());
		businesscontactDTO.setEmailId2(businessContact.getEmailId2());
		businesscontactDTO.setLandLineNo(businessContact.getLandLineNo());
		businesscontactDTO.setLastUpdateddate(businessContact.getLastUpdateddate());
		businesscontactDTO.setBusinesssrcID(businessContact.getTBusinesssrc().getBusiSrcId());
		businesscontactDTO.setPhoneNo(businessContact.getPhoneNo());
		businesscontactDTO.setMobileNo1(businessContact.getMobileNo1());
		businesscontactDTO.setMobileNo2(businessContact.getMobileNo2());
		
		return businesscontactDTO;
	}
	
	public static BusinesssrcDTO TBusineBusinessSrcToBusinesssrcDTO(TBusinesssrc tBusinesssrc){
		BusinesssrcDTO businesssrcDTO = new BusinesssrcDTO();
		businesssrcDTO.setAcstatus(tBusinesssrc.getAcstatus());
		businesssrcDTO.setAdharCardNo(tBusinesssrc.getAdharCardNo());
		businesssrcDTO.setBusiName(tBusinesssrc.getBusiName());
		businesssrcDTO.setBusiSrcId(tBusinesssrc.getBusiSrcId());
		businesssrcDTO.setBusiTypeid(tBusinesssrc.getLBusinesstype().getBusitypeid());
		businesssrcDTO.setCreatedby(tBusinesssrc.getCreatedby());
		businesssrcDTO.setUpdatedby(tBusinesssrc.getUpdatedby());
		businesssrcDTO.setCreateddate(tBusinesssrc.getCreateddate());
		businesssrcDTO.setLastupdateddate(tBusinesssrc.getLastupdateddate());
		businesssrcDTO.setPancardNo(tBusinesssrc.getPancardNo());
		businesssrcDTO.setUserId(tBusinesssrc.getTUser().getId());
		return businesssrcDTO;
	}
	
	public static CountryDTO LCountryToCountryDTO(LCountry country){
		CountryDTO countryDTO = new CountryDTO();
		countryDTO.setCountryid(country.getCountryid());
		countryDTO.setCountryname(country.getCountryname());
		countryDTO.setStatus(country.getStatus());
		return countryDTO;
	}
	
	public static StateDTO LStateToStateDTO(LState state){
		StateDTO stateDTO = new StateDTO();
		stateDTO.setStateId(state.getStateId());
		stateDTO.setStateName(state.getStateName());
		stateDTO.setCountryID(state.getLCountry().getCountryid());
		stateDTO.setStatus(state.getStatus());
		return stateDTO;
	}
	
	public static CityDTO LCityToCityDTO(LCity city){
		CityDTO cityDTO = new CityDTO();
		cityDTO.setCityid(city.getCityid());
		cityDTO.setCityname(city.getCityname());
		cityDTO.setStateID(city.getLState().getStateId());
		cityDTO.setStatus(city.getStatus());
		return cityDTO;
	}
	
	public static ZipDTO LZipToZipDTO(LZipcode zip){
		ZipDTO zipDTO = new ZipDTO();
		zipDTO.setZipid(zip.getZipid());
		zipDTO.setZipcode(zip.getZipcode());
		zipDTO.setCityId(zip.getLCity().getCityid());
		zipDTO.setStatus(zip.getStatus());
		return zipDTO;
	}

	public static AreaDTO LAreaToAreaDTO(LArea area){
		AreaDTO areaDTO = new AreaDTO();
		areaDTO.setAreaid(area.getAreaid());
		areaDTO.setAreaname(area.getAreaname());
		areaDTO.setZipId(area.getLZipcode().getZipid());
		areaDTO.setStatus(area.getStatus());
		return areaDTO;
	}
	
	public static BusinessTypeDTO lBusinessTypeToBusinessTypeDTO(LBusinesstype lBusinesstype){
		BusinessTypeDTO businessTypeDTO = new BusinessTypeDTO();
		businessTypeDTO.setBusiType(lBusinesstype.getBusiType());
		businessTypeDTO.setBusitypeid(lBusinesstype.getBusitypeid());
		businessTypeDTO.setDescription(lBusinesstype.getDescription());
		return businessTypeDTO;
	}
}
