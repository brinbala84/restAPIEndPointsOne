package com.agilisium.restAPIEndPointsOne.service;

import java.util.List;

import com.agilisium.restAPIEndPointsOne.model.User;

public interface UserService {
	
	List<User> findAllUsers();
	
	List<User> getConfigdetails();
		
}

