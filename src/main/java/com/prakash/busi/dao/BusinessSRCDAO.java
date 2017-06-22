package com.prakash.busi.dao;

import com.prakash.busi.model.TBusinesssrc;

public interface BusinessSRCDAO {
	public  TBusinesssrc getBusinessSrcByID(Long id);
	public  TBusinesssrc saveBusinessSrc(TBusinesssrc address);
	public  TBusinesssrc updateBusinessSrc(TBusinesssrc address);
}