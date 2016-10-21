package org.hao.springmvc.dao.Impl;

import java.util.List;

import org.hao.springmvc.dao.AbstractDao;
import org.hao.springmvc.dao.UserProfileDao;
import org.hao.springmvc.model.UserProfile;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile> implements UserProfileDao {

	@SuppressWarnings("unchecked")
	public List<UserProfile> findAll() {
		Criteria crit = createEntityCriteria();
        crit.addOrder(Order.asc("type"));
        return (List<UserProfile>)crit.list();
	}

	@Override
	public UserProfile findByType(String type) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("type", type));
        return (UserProfile) crit.uniqueResult();
	}

	@Override
	public UserProfile findById(int id) {
		return getByKey(id);
	}

}
