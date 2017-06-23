package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
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
		logger.info("ZipDAOImpl.saveZip(...)");
		update(zip);
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
	@SuppressWarnings("unchecked")
	public List<LZipcode> getAllZipByCityId(Long id) {
		logger.info("ZipDAOImpl.getAllZipByCityId(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.add(Restrictions.eq("LCity.cityid", id));
		List<LZipcode> zipList = (List<LZipcode>) criteria.list();
		return zipList;
	}
}
