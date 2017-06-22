package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LArea;

public interface AreaDAO {
	public LArea getAreaByID(Long id);
	public LArea saveArea(LArea area);
	public List<LArea> getAllArea();
	public List<LArea> getAllAreaByZipId();
}
