package com.prakash.busi.service;

import com.prakash.busi.dto.BusinesscontactDTO;

public interface BusinessContactService {
	public BusinesscontactDTO getContactByID(Long id);
	public BusinesscontactDTO saveContact(BusinesscontactDTO businesscontactDTO);
	public BusinesscontactDTO updateContact(BusinesscontactDTO businesscontactDTO);
}
