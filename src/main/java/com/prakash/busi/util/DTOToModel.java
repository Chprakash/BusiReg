package com.prakash.busi.util;

import java.util.Date;

import com.prakash.busi.dto.BusinessTypeDTO;
import com.prakash.busi.dto.BusinesscontactDTO;
import com.prakash.busi.dto.BusinesssrcDTO;
import com.prakash.busi.dto.RoleDTO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.LBusinesstype;
import com.prakash.busi.model.LRole;
import com.prakash.busi.model.TBusinesscontact;
import com.prakash.busi.model.TBusinesssrc;
import com.prakash.busi.model.TTempClient;
import com.prakash.busi.model.TUser;

public class DTOToModel {
	
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
	
	public static LRole RoleDTOToLRole(RoleDTO roleDTO){
		LRole lRole= new LRole();
		lRole.setId(roleDTO.getId());
		lRole.setType(roleDTO.getType());
		return lRole;
	}
	
	public static TBusinesscontact BusinesscontactDTOToTBusinessContact(BusinesscontactDTO businesscontactDTO){
		TBusinesscontact businessContact = new TBusinesscontact();
		businessContact.setAreaCode(businesscontactDTO.getAreaCode());
		businessContact.setContactid(businesscontactDTO.getContactid());
		businessContact.setContactPersonFName(businesscontactDTO.getContactPersonFName());
		businessContact.setContactPersonLName(businesscontactDTO.getContactPersonLName());
		businessContact.setContactPersonMName(businesscontactDTO.getContactPersonMName());
		
		businessContact.setCreatedBy(businesscontactDTO.getCreatedBy());
		businessContact.setCreatedDate(businesscontactDTO.getCreatedDate());
		businessContact.setEmailId1(businesscontactDTO.getEmailId1());
		businessContact.setEmailId2(businesscontactDTO.getEmailId2());
		businessContact.setLandLineNo(businesscontactDTO.getLandLineNo());
		businessContact.setLastUpdateddate(businesscontactDTO.getLastUpdateddate());
		businessContact.setPhoneNo(businesscontactDTO.getPhoneNo());
		businessContact.setMobileNo1(businesscontactDTO.getMobileNo1());
		businessContact.setMobileNo2(businesscontactDTO.getMobileNo2());
		businessContact.setUpdatedBy(businesscontactDTO.getUpdatedBy());
		
		return businessContact;
	}
	
	public static TBusinesssrc BusinessSrcDTOToTBusinesssrc(BusinesssrcDTO BusinesssrcDTO){
		TBusinesssrc tBusinesssrc = new TBusinesssrc();
		tBusinesssrc.setAcstatus(BusinesssrcDTO.getAcstatus());
		tBusinesssrc.setAdharCardNo(BusinesssrcDTO.getAdharCardNo());
		tBusinesssrc.setBusiName(BusinesssrcDTO.getBusiName());
		//tBusinesssrc.setLBusinesstype(LBusinesstype);(BusinesssrcDTO.getLBusinesstype().getBusitypeid());
		tBusinesssrc.setCreatedby(BusinesssrcDTO.getCreatedby());
		tBusinesssrc.setUpdatedby(BusinesssrcDTO.getUpdatedby());
		tBusinesssrc.setCreateddate(BusinesssrcDTO.getCreateddate());
		tBusinesssrc.setLastupdateddate(BusinesssrcDTO.getLastupdateddate());
		tBusinesssrc.setPancardNo(BusinesssrcDTO.getPancardNo());
		//tBusinesssrc.setUserId(BusinesssrcDTO.getTUser().getId());
		return tBusinesssrc;
	}
	
	public static LBusinesstype businesstypeDTOToLBusinesstype(BusinessTypeDTO businessTypeDTO){
		LBusinesstype lBusinesstype= new LBusinesstype();
		lBusinesstype.setBusiType(businessTypeDTO.getBusiType());
		lBusinesstype.setBusitypeid(businessTypeDTO.getBusitypeid());
		lBusinesstype.setDescription(businessTypeDTO.getDescription());
		lBusinesstype.setCreateddate(new Date());
		lBusinesstype.setLastupdateddate(new Date());
		return lBusinesstype;
	}
	
	
/*	public static LZipcode ZipDTOToLZipcode(ZipDTO zipDTO){
		LZipcode lZipcode= new LZipcode();
		lZipcode.setZipcode(zipDTO.getZipcode());
		lZipcode.setCreateddate(new Date());
		lZipcode.set
		return lRole;
	}*/
}
