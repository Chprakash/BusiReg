package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AreaDAO;
import com.prakash.busi.dto.AreaDTO;
import com.prakash.busi.model.LArea;
import com.prakash.busi.service.AreaService;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDAO areaDAO;
	
	@Override
	public AreaDTO getAreaByID(Long id) {
		return ModelToDTO.LAreaToAreaDTO(areaDAO.getAreaByID(id));
	}

	@Override
	public List<AreaDTO> getAllArea() {
		List<LArea> areas= areaDAO.getAllArea();
		List<AreaDTO> areaDTOs=new ArrayList<AreaDTO>();
		for (LArea lAreas : areas) {
			areaDTOs.add(ModelToDTO.LAreaToAreaDTO(lAreas));
		}
		return areaDTOs;
	}

	@Override
	public List<AreaDTO> getAllAreaByZipID(Long id) {
		List<LArea> areas= areaDAO.getAllAreaByZipId(id);
		List<AreaDTO> areaDTOs=new ArrayList<AreaDTO>();
		for (LArea lAreas : areas) {
			areaDTOs.add(ModelToDTO.LAreaToAreaDTO(lAreas));
		}
		return areaDTOs;
	}

	@Override
	public AreaDTO saveArea(AreaDTO areaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
