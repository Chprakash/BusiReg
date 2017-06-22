package com.prakash.busi.dao;

import com.prakash.busi.model.TBusinesscontact;

public interface BusinessContactDAO {
	public TBusinesscontact getContactByID(Long id);
	public TBusinesscontact saveContact(TBusinesscontact TBusinesscontact);
	public TBusinesscontact updateContact(TBusinesscontact TBusinesscontact);
}
