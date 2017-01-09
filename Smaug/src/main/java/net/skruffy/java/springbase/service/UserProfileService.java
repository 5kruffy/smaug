package net.skruffy.java.springbase.service;

import java.util.List;

import net.skruffy.java.springbase.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
