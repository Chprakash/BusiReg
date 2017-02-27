package com.prakash.busi.dao;

import com.prakash.busi.model.TAddresses;

public interface AddressDAO {
	public TAddresses getAddressByID(Long id);
	public TAddresses saveAddress(TAddresses address);
	public TAddresses updateAddress(TAddresses address);
}
