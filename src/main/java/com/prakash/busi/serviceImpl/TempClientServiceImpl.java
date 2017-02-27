package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prakash.busi.dao.TempClientDAO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.model.TTempClient;
import com.prakash.busi.service.TempClientService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
public class TempClientServiceImpl implements TempClientService{
	
	@Autowired
	private TempClientDAO tempclientDAO;

	@Override
	public TempClientDTO getTempClientByID(Long id) {
		return ModelToDTO.TTempClientToTempClientDTO(tempclientDAO.getTempClientByID(id));
	}

	@Override
	public TempClientDTO saveTempClient(TempClientDTO tempClientDTO) {
		TTempClient tempClient=DTOToModel.TempClientDTOToTempClient(tempClientDTO);
		return ModelToDTO.TTempClientToTempClientDTO(tempclientDAO.saveTempClient(tempClient));
	}

	@Override
	public TempClientDTO updateTempClient(TempClientDTO tempClientDTO) {
		TTempClient tempClient=DTOToModel.TempClientDTOToTempClient(tempClientDTO);
		return ModelToDTO.TTempClientToTempClientDTO(tempclientDAO.updateTempClient(tempClient));
	}

}
