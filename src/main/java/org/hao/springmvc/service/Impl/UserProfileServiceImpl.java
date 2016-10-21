package org.hao.springmvc.service.Impl;

import java.util.List;

import org.hao.springmvc.dao.UserProfileDao;
import org.hao.springmvc.model.UserProfile;
import org.hao.springmvc.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileDao dao;

	@Override
	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	@Override
	public UserProfile findByType(String type) {
		return dao.findByType(type);
	}

	@Override
	public List<UserProfile> findAll() {
		return dao.findAll();
	}

}
