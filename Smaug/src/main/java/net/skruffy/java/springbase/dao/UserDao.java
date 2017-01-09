package net.skruffy.java.springbase.dao;

import java.util.List;

import net.skruffy.java.springbase.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

