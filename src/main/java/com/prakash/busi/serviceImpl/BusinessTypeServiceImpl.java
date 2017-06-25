package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.BusinessTypeDAO;
import com.prakash.busi.dto.BusinessTypeDTO;
import com.prakash.busi.model.LBusinesstype;
import com.prakash.busi.service.BusinessTypeService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class BusinessTypeServiceImpl implements BusinessTypeService{

	@Autowired
	private BusinessTypeDAO businessTypeDAO;
	
	@Override
	public BusinessTypeDTO getBusinessTypeByID(Long id) {
		return ModelToDTO.lBusinessTypeToBusinessTypeDTO(businessTypeDAO.getBusinessTypeByID(id));
	}

	@Override
	public List<BusinessTypeDTO> getAllBusinessTypes() {
		List<LBusinesstype> businessTypes= businessTypeDAO.getAllBusinessType();
		List<BusinessTypeDTO> businessTypeDTOs=new ArrayList<BusinessTypeDTO>();
		for (LBusinesstype lBusinesstype : businessTypes) {
			businessTypeDTOs.add(ModelToDTO.lBusinessTypeToBusinessTypeDTO(lBusinesstype));
		}
		return businessTypeDTOs;
	}

	@Override
	public BusinessTypeDTO saveBusinessType(BusinessTypeDTO businessTypeDTO) {
		LBusinesstype businesstype = DTOToModel.businesstypeDTOToLBusinesstype(businessTypeDTO);
		return ModelToDTO.lBusinessTypeToBusinessTypeDTO(businessTypeDAO.saveBusinessType(businesstype));
	}

}
