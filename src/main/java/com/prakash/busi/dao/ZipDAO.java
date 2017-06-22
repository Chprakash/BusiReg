package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LZipcode;

public interface ZipDAO {
	public LZipcode getZipByID(Long id);
	public LZipcode saveZip(LZipcode area);
	public List<LZipcode> getAllZip();
	public List<LZipcode> getAllZipByCityId();
}
