package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.BusinesscontactDTO;

public interface BusinessContactService {
	public BusinesscontactDTO getContactByID(Long id);
	public BusinesscontactDTO saveContact(BusinesscontactDTO businesscontactDTO);
	public BusinesscontactDTO updateContact(BusinesscontactDTO businesscontactDTO);
	public List<BusinesscontactDTO> getContactByBusinessSrcID(Long id);
}
