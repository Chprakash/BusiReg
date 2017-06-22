package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.ZipDAO;
import com.prakash.busi.model.LZipcode;

@Repository
@Transactional
public class ZipDAOImpl extends AbstractDao<Long, LZipcode> implements ZipDAO{

	static final Logger logger = LoggerFactory.getLogger(ZipDAOImpl.class);

	@Override
	public LZipcode getZipByID(Long id) {
		logger.info("ZipDAOImpl.getZipByID(...)");
		LZipcode zip = getByKey(id);
		if(zip!=null){
			return zip;
		}
		return null;
	}

	@Override
	public LZipcode saveZip(LZipcode zip) {
		return zip;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LZipcode> getAllZip() {
		logger.info("ZipDAOImpl.getAllZip(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LZipcode> ZipList = (List<LZipcode>) criteria.list();
		return ZipList;
	}

	@Override
	public List<LZipcode> getAllZipByCityId() {
		// TODO Auto-generated method stub
		return null;
	}
}
