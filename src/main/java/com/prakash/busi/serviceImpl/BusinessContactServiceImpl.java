package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.BusinessContactDAO;
import com.prakash.busi.dao.BusinessSRCDAO;
import com.prakash.busi.dao.CountryDAO;
import com.prakash.busi.dto.BusinesscontactDTO;
import com.prakash.busi.model.TBusinesscontact;
import com.prakash.busi.service.BusinessContactService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class BusinessContactServiceImpl implements BusinessContactService{
	
	@Autowired
	private BusinessContactDAO businessContactDAO;
	
	@Autowired
	private BusinessSRCDAO businessSRCDAO;
	@Autowired
	private CountryDAO countryDAO;

	@Override
	public BusinesscontactDTO getContactByID(Long id) {
		return ModelToDTO.TBusinessContactToBusinesscontactDTO(businessContactDAO.getContactByID(id));
	}

	@Override
	public BusinesscontactDTO saveContact(BusinesscontactDTO businesscontactDTO) {
		businesscontactDTO.setCreatedBy(5L);
		businesscontactDTO.setCreatedDate(new Date());
		businesscontactDTO.setLastUpdateddate(new Date());
		TBusinesscontact businessContact = DTOToModel.BusinesscontactDTOToTBusinessContact(businesscontactDTO);
		businessContact.setTBusinesssrc(businessSRCDAO.getBusinessSrcByID(businesscontactDTO.getBusinesssrcID()));
		return ModelToDTO.TBusinessContactToBusinesscontactDTO(businessContactDAO.saveContact(businessContact));
	}

	@Override
	public BusinesscontactDTO updateContact(BusinesscontactDTO businesscontactDTO) {
		businesscontactDTO.setLastUpdateddate(new Date());
		TBusinesscontact savedBusinesscontact = businessContactDAO.getContactByID(businesscontactDTO.getContactid());
		savedBusinesscontact =getConvertedTobusinesscontact(businesscontactDTO,savedBusinesscontact);
		return ModelToDTO.TBusinessContactToBusinesscontactDTO(savedBusinesscontact);

	}

	private TBusinesscontact getConvertedTobusinesscontact(BusinesscontactDTO businesscontactDTO,TBusinesscontact savedBusinesscontact) {
		TBusinesscontact businessContact = savedBusinesscontact;
		if(null!=businesscontactDTO.getAreaCode()){
			businessContact.setAreaCode(businesscontactDTO.getAreaCode());
		}
		if(null!=businesscontactDTO.getContactid()){
			businessContact.setContactid(businesscontactDTO.getContactid());
		}
		if(null!=businesscontactDTO.getContactPersonFName()){
			businessContact.setContactPersonFName(businesscontactDTO.getContactPersonFName());
		}
		if(null!=businesscontactDTO.getContactPersonLName()){
			businessContact.setContactPersonLName(businesscontactDTO.getContactPersonLName());
		}
		if(null!=businesscontactDTO.getContactPersonMName()){
			businessContact.setContactPersonMName(businesscontactDTO.getContactPersonMName());
		}
		if(null!=businesscontactDTO.getCountryId()){
			businessContact.setLCountry(countryDAO.getCountryByID(businesscontactDTO.getCountryId()));
		}
		if(null!=businesscontactDTO.getCreatedBy()){
			businessContact.setCreatedBy(businesscontactDTO.getCreatedBy());
		}
		if(null!=businesscontactDTO.getCreatedDate()){
			businessContact.setCreatedDate(businesscontactDTO.getCreatedDate());
		}
		if(null!=businesscontactDTO.getEmailId1()){
			businessContact.setEmailId1(businesscontactDTO.getEmailId1());
		}
		if(null!=businesscontactDTO.getEmailId2()){
			businessContact.setEmailId2(businesscontactDTO.getEmailId2());
		}
		if(null!=businesscontactDTO.getLandLineNo()){
			businessContact.setLandLineNo(businesscontactDTO.getLandLineNo());
		}
		if(null!=businesscontactDTO.getLastUpdateddate()){
			businessContact.setLastUpdateddate(businesscontactDTO.getLastUpdateddate());
		}
		if(null!=businesscontactDTO.getPhoneNo()){
			businessContact.setPhoneNo(businesscontactDTO.getPhoneNo());
		}
		if(null!=businesscontactDTO.getMobileNo1()){
			businessContact.setMobileNo1(businesscontactDTO.getMobileNo1());
		}
		if(null!=businesscontactDTO.getMobileNo2()){
			businessContact.setMobileNo2(businesscontactDTO.getMobileNo2());
		}
		if(null!=businesscontactDTO.getUpdatedBy()){
			businessContact.setUpdatedBy(businesscontactDTO.getUpdatedBy());
		}
		return businessContact;
	
	}

	@Override
	public List<BusinesscontactDTO> getContactByBusinessSrcID(Long id) {
		List<TBusinesscontact> businesscontacts= businessContactDAO.getContactByBusinessSRCID(id);
		List<BusinesscontactDTO> businesscontactDTOs=new ArrayList<BusinesscontactDTO>();
		for (TBusinesscontact tBusinesscontact : businesscontacts) {
			businesscontactDTOs.add(ModelToDTO.TBusinessContactToBusinesscontactDTO(tBusinesscontact));
		}
		return businesscontactDTOs;
	}

}
