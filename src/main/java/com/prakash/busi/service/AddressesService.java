package com.prakash.busi.service;

import com.prakash.busi.dto.AddressesDTO;

public interface AddressesService {
	public AddressesDTO getAddressByID(Long id);
	public AddressesDTO saveAddress(AddressesDTO addressDTO);
	public AddressesDTO updateAddress(AddressesDTO addressDTO);
}
