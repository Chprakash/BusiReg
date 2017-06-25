package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.BusinessSRCDAO;
import com.prakash.busi.dao.BusinessTypeDAO;
import com.prakash.busi.dao.UserDAO;
import com.prakash.busi.dto.BusinesssrcDTO;
import com.prakash.busi.model.TBusinesssrc;
import com.prakash.busi.service.BusinessSrcService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class BusinessSrcServiceImpl implements BusinessSrcService{
	
	@Autowired
	private BusinessSRCDAO businessSRCDAO;
	
	@Autowired
	private BusinessTypeDAO businessTypeDAO;
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public BusinesssrcDTO getBusinessSrcByID(Long id) {
		return ModelToDTO.TBusineBusinessSrcToBusinesssrcDTO(businessSRCDAO.getBusinessSrcByID(id));
	}

	@Override
	public BusinesssrcDTO saveBusinessSrc(BusinesssrcDTO businesssrcDTO) {
		businesssrcDTO.setCreatedby(5L);
		businesssrcDTO.setCreateddate(new Date());
		businesssrcDTO.setLastupdateddate(new Date());
		TBusinesssrc businessSrc = DTOToModel.BusinessSrcDTOToTBusinesssrc(businesssrcDTO);
		businessSrc.setLBusinesstype(businessTypeDAO.getBusinessTypeByID(businesssrcDTO.getBusiTypeid()));
		businessSrc.setTUser(userDAO.getUserByID(businesssrcDTO.getUserId()));
		return ModelToDTO.TBusineBusinessSrcToBusinesssrcDTO(businessSRCDAO.saveBusinessSrc(businessSrc));
	
	}

	@Override
	public BusinesssrcDTO updateBusinessSrc(BusinesssrcDTO businesssrcDTO) {
		businesssrcDTO.setCreatedby(5L);
		businesssrcDTO.setLastupdateddate(new Date());
		TBusinesssrc businessSrc = DTOToModel.BusinessSrcDTOToTBusinesssrc(businesssrcDTO);
		businessSrc.setLBusinesstype(businessTypeDAO.getBusinessTypeByID(businesssrcDTO.getBusiTypeid()));
		businessSrc.setTUser(userDAO.getUserByID(businesssrcDTO.getUserId()));
		return ModelToDTO.TBusineBusinessSrcToBusinesssrcDTO(businessSRCDAO.updateBusinessSrc(businessSrc));
	
	}

}
