package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.CountryDAO;
import com.prakash.busi.model.LCountry;

@Repository
@Transactional
public class CountryDAOImpl extends AbstractDao<Long, LCountry> implements CountryDAO{

	static final Logger logger = LoggerFactory.getLogger(CountryDAOImpl.class);
	
	@Override
	public LCountry getCountryByID(Long id) {
		logger.info("CountryDAOImpl.getCountryByID(...)");
		LCountry country = getByKey(id);
		if(country!=null){
			return country;
		}
		return null;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<LCountry> getAllCountries() {
		logger.info("CountryDAOImpl.getAllCountries(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LCountry> countryList = (List<LCountry>) criteria.list();
		return countryList;
	}

}
