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
import com.prakash.busi.dao.AreaDAO;
import com.prakash.busi.model.LArea;


@Repository
@Transactional
public class AreaDAOImpl extends AbstractDao<Long, LArea> implements AreaDAO{
	
	static final Logger logger = LoggerFactory.getLogger(AreaDAOImpl.class);

	@Override
	public LArea getAreaByID(Long id) {
		logger.info("AreaDAOImpl.getAreaByID(...)");
		LArea area = getByKey(id);
		if(area!=null){
			return area;
		}
		return null;
	}

	@Override
	public LArea saveArea(LArea area) {
		return area;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LArea> getAllArea() {
		logger.info("AreaDAOImpl.getAllArea(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LArea> areaList = (List<LArea>) criteria.list();
		return areaList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LArea> getAllAreaByZipId(Long id) {
		logger.info("AreaDAOImpl.getAllAreaByZipId(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.add(Restrictions.eq("LZipcode.zipid", id));
		List<LArea> aeraList = (List<LArea>) criteria.list();
		return aeraList;
	}

}
