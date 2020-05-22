package com.agilisium.restAPIEndPointsOne.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.agilisium.restAPIEndPointsOne.model.User;

@Service("userService")
public class UserImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	private static List<User> products;
	private static List<User> configDetails;
	
	static{
		users= populateDummyUsers();
		configDetails = populateConfigDetails();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public List<User> getConfigdetails() {
		return configDetails;
	}
	

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Finance"));
		users.add(new User(counter.incrementAndGet(),"Manufacturing"));
		users.add(new User(counter.incrementAndGet(),"Mutual Funds"));
		users.add(new User(counter.incrementAndGet(),"Payments"));
		return users;
	}
	
	private static List<User> populateConfigDetails(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"12"));
		users.add(new User(counter.incrementAndGet(),"18"));
		users.add(new User(counter.incrementAndGet(),"24"));
		return users;
	}
}