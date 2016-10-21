package org.hao.springmvc.dao;

import java.util.List;

import org.hao.springmvc.model.UserProfile;

public interface UserProfileDao {
	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}
