package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.ZipDAO;
import com.prakash.busi.dto.ZipDTO;
import com.prakash.busi.model.LZipcode;
import com.prakash.busi.service.ZipService;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class ZipServiceImpl implements ZipService{

	@Autowired
	private ZipDAO zipDAO;
	
	@Override
	public ZipDTO getZipByID(Long id) {
		return ModelToDTO.LZipToZipDTO(zipDAO.getZipByID(id));
	}

	@Override
	public List<ZipDTO> getAllZip() {
		List<LZipcode> zips= zipDAO.getAllZip();
		List<ZipDTO> zipDTOs=new ArrayList<ZipDTO>();
		for (LZipcode lZips : zips) {
			zipDTOs.add(ModelToDTO.LZipToZipDTO(lZips));
		}
		return zipDTOs;
	}

	@Override
	public List<ZipDTO> getAllZipByCityID(Long id) {
		List<LZipcode> zips= zipDAO.getAllZipByCityId(id);
		List<ZipDTO> zipDTOs=new ArrayList<ZipDTO>();
		for (LZipcode lZips : zips) {
			zipDTOs.add(ModelToDTO.LZipToZipDTO(lZips));
		}
		return zipDTOs;
	}

	@Override
	public ZipDTO saveZip(ZipDTO zipDTO) {
		return null;
	}

}
