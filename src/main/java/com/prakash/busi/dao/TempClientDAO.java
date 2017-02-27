package com.prakash.busi.dao;

import com.prakash.busi.model.TTempClient;

public interface TempClientDAO {

	public TTempClient getTempClientByID(Long id);
	public TTempClient saveTempClient(TTempClient tempClient);
	public TTempClient updateTempClient(TTempClient tempClient);
}
