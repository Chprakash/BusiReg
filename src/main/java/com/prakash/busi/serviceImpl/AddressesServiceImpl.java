package com.prakash.busi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prakash.busi.dao.AddressDAO;
import com.prakash.busi.dto.AddressesDTO;
import com.prakash.busi.service.AddressesService;
import com.prakash.busi.util.ModelToDTO;

@Component
public class AddressesServiceImpl implements AddressesService{

	@Autowired
	private AddressDAO addressDAO;
	
	@Override
	public AddressesDTO getAddressByID(Long id) {
		return ModelToDTO.TAddressToAddressDTO(addressDAO.getAddressByID(id));
	}

	@Override
	public AddressesDTO saveAddress(AddressesDTO addressDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressesDTO updateAddress(AddressesDTO addressDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
