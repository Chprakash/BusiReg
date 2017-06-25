package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.BusinessTypeDTO;

public interface BusinessTypeService {
	public BusinessTypeDTO getBusinessTypeByID(Long id);
	public List<BusinessTypeDTO> getAllBusinessTypes();
	public BusinessTypeDTO saveBusinessType(BusinessTypeDTO businessTypeDTO);
}
