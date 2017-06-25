package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LBusinesstype;

public interface BusinessTypeDAO {
	public LBusinesstype getBusinessTypeByID(Long id);
	public LBusinesstype saveBusinessType(LBusinesstype lBusinesstype);
	public List<LBusinesstype> getAllBusinessType();
}
