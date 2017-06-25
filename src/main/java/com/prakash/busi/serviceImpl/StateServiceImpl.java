package com.prakash.busi.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.StateDAO;
import com.prakash.busi.dto.StateDTO;
import com.prakash.busi.model.LState;
import com.prakash.busi.service.StateService;
import com.prakash.busi.util.ModelToDTO;

@Component
@Transactional
public class StateServiceImpl implements StateService{

	@Autowired
	private StateDAO stateDAO;
	
	@Override
	public StateDTO getStateByID(Long id) {
		return ModelToDTO.LStateToStateDTO(stateDAO.getStateByID(id));
	}

	@Override
	public List<StateDTO> getAllStates() {
		List<LState> states= stateDAO.getAllStates();
		List<StateDTO> stateDTO=new ArrayList<StateDTO>();
		for (LState lStates : states) {
			stateDTO.add(ModelToDTO.LStateToStateDTO(lStates));
		}
		return stateDTO;
	}
	
	@Override
	public List<StateDTO> getStateByCountryID(Long id) {
		List<LState> states= stateDAO.getAllStatesByCountryID(id);
		List<StateDTO> stateDTO=new ArrayList<StateDTO>();
		for (LState lStates : states) {
			stateDTO.add(ModelToDTO.LStateToStateDTO(lStates));
		}
		return stateDTO;
	}


}
