package com.prakash.busi.service;

import com.prakash.busi.dto.BusinesssrcDTO;

public interface BusinessSrcService {
	public BusinesssrcDTO getBusinessSrcByID(Long id);
	public BusinesssrcDTO saveBusinessSrc(BusinesssrcDTO businesssrcDTO);
	public BusinesssrcDTO updateBusinessSrc(BusinesssrcDTO businesssrcDTO);
}
