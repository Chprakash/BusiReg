package com.prakash.busi.service;

import com.prakash.busi.dto.TempClientDTO;

public interface TempClientService {
	public TempClientDTO getTempClientByID(Long id);
	public TempClientDTO saveTempClient(TempClientDTO tempClientDTO);
	public TempClientDTO updateTempClient(TempClientDTO tempClientDTO);
}
