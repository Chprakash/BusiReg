package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.BusinessContactDAO;
import com.prakash.busi.dao.BusinessSRCDAO;
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
	public BusinesscontactDTO updateContact(
			BusinesscontactDTO businesscontactDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
