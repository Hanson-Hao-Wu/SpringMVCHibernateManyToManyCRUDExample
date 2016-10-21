package org.hao.springmvc.service;

import java.util.List;

import org.hao.springmvc.model.UserProfile;

public interface UserProfileService {
	
	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
}
