package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.AreaDTO;

public interface AreaService {
	public AreaDTO getAreaByID(Long id);
	public List<AreaDTO> getAllArea();
	public List<AreaDTO> getAllAreaByZipID(Long id);
	public AreaDTO saveArea(AreaDTO areaDTO);
}
