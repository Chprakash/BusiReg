package com.prakash.busi.service;

import java.util.List;

import com.prakash.busi.dto.ZipDTO;

public interface ZipService {
	public ZipDTO getZipByID(Long id);
	public List<ZipDTO> getAllZip();
	public List<ZipDTO> getAllZipByCityID(Long id);
	public ZipDTO saveZip(ZipDTO zipDTO);
}
