package com.prakash.busi.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.RoleDAO;
import com.prakash.busi.dao.TempClientDAO;
import com.prakash.busi.dao.UserDAO;
import com.prakash.busi.dto.TempClientDTO;
import com.prakash.busi.dto.UserDTO;
import com.prakash.busi.model.TTempClient;
import com.prakash.busi.model.TUser;
import com.prakash.busi.service.TempClientService;
import com.prakash.busi.util.DTOToModel;
import com.prakash.busi.util.ModelToDTO;

@Component
public class TempClientServiceImpl implements TempClientService{
	
	@Autowired
	private TempClientDAO tempclientDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private RoleDAO roleDAO;

	@Override
	public TempClientDTO getTempClientByID(Long id) {
		return ModelToDTO.tTempClientToTempClientDTO(tempclientDAO.getTempClientByID(id));
	}

	@Override
	@Transactional
	public TempClientDTO saveTempClient(TempClientDTO tempClientDTO) {
		tempClientDTO.setActive(0L);
		tempClientDTO.setCreatedDate(new Date());
		tempClientDTO.setLastUpdatedDate(new Date());
		TTempClient tempClient=DTOToModel.TempClientDTOToTempClient(tempClientDTO);
		TUser user=DTOToModel.TempClientDTOToTuser(tempClientDTO);
		//I know this line should be in DTOToModel.addressDTOToAddresss(addressDTO) method
		// but don't know y this is not working there. I am getting roleDAO as a null while doing autowiring.
		//This is a workaround will fix it later on. 
		user.setLRole(roleDAO.getRoleByID(5L));
		userDAO.saveUser(user);
		tempClient=tempclientDAO.saveTempClient(tempClient);
		return ModelToDTO.tTempClientToTempClientDTO(tempClient);
	}

	@Override
	public TempClientDTO updateTempClient(TempClientDTO tempClientDTO) {
		tempClientDTO.setActive(1L);
		tempClientDTO.setLastUpdatedDate(new Date());
		TTempClient client=tempclientDAO.getTempClientByID(tempClientDTO.getId());
		TempClientDTO clientDTO=ModelToDTO.tTempClientToTempClientDTO(client);
		clientDTO.setActive(tempClientDTO.getActive());
		clientDTO.setBirthday(tempClientDTO.getBirthday());
		clientDTO.setCreatedBy(tempClientDTO.getCreatedBy());
		clientDTO.setCreatedDate(tempClientDTO.getCreatedDate());
		clientDTO.setEmailId(tempClientDTO.getEmailId());
		clientDTO.setFirstName(tempClientDTO.getFirstName());
		clientDTO.setLastName(tempClientDTO.getLastName());
		clientDTO.setMiddleName(tempClientDTO.getMiddleName());
		clientDTO.setMobile(tempClientDTO.getMobile());
		clientDTO.setPassword(tempClientDTO.getPassword());
		clientDTO.setLastUpdatedDate(tempClientDTO.getLastUpdatedDate());
		TTempClient tempClient=DTOToModel.TempClientDTOToTempClient(clientDTO);
		tempClient.setVersion(client.getVersion());
		return ModelToDTO.tTempClientToTempClientDTO(tempclientDAO.updateTempClient(tempClient));
	}

}
