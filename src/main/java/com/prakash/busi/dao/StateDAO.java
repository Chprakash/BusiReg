package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.LState;

public interface StateDAO {
	public LState getStateByID(Long id);
	public List<LState> getAllStates();
	public List<LState> getAllStatesByCountryID(Long id);
}
