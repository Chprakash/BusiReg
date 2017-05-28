package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.RoleDAO;
import com.prakash.busi.model.LRole;
import com.prakash.busi.model.TTempClient;

@Repository
@Transactional
public class RoleDAOImpl extends AbstractDao<Long, LRole> implements RoleDAO{
	
	static final Logger logger = LoggerFactory.getLogger(RoleDAOImpl.class);
	
	@Override
	@SuppressWarnings("unchecked")
	public List<LRole> getRoleList() {
		logger.info("getRoleList(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<LRole> roleList = (List<LRole>) criteria.list();
		return roleList;
	}
	
	@Override
	public LRole saveRole(LRole role) {
		logger.info("saveRole(...)");
		save(role);
		return role;
	}
	
	@Override
	public LRole getRoleByID(Long id) {
		logger.info("RoleDAOImpl.getRoleByID(...)");
		LRole role = getByKey(id);
		if(role!=null){
			return role;
		}
		return null;
	}

	@Override
	public LRole updateRole(LRole role) {
		logger.info("updateRole(...)");
		update(role);
		return role;
	}

}
