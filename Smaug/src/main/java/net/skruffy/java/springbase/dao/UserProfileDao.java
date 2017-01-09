package net.skruffy.java.springbase.dao;

import java.util.List;

import net.skruffy.java.springbase.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
