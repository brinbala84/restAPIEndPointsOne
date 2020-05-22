package com.agilisium.restAPIEndPointsOne.controller;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.agilisium.restAPIEndPointsOne.model.User;
import com.agilisium.restAPIEndPointsOne.service.UserService;

@RestController
@RequestMapping(path = "/loginDetails")
public class UserController 
{
	
	@Autowired
	UserService userService;
    
    @RequestMapping(value = "{domain}/api/getproductdetails", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getproductdetails(@PathVariable("domain") String domain) {
		List<User> users = userService.findAllUsers();
		String domainName = "";
		Iterator<User> itr = users.iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			domainName = user.getDomain();
			
			if(users.contains("Telecom") && domainName.equals("Telecom")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.OK);
			} else if(domain.equals("Payments") && domainName.equals("Payments")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.NO_CONTENT);
			} else if(domain.equals("Manufacturing") && domainName.equals("Manufacturing")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
			} else if(domain.equals("Mutual Funds") && domainName.equals("Mutual Funds")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.PROCESSING);
			} else if(domain.equals("Finance") && domainName.equals("Finance")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.REQUEST_TIMEOUT);
			}
			
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
    
	@RequestMapping(value="{domain}/api/getconfigdetails",method=RequestMethod.GET) 
	public ResponseEntity<List<User>> getconfigdetails(@PathVariable("domain") String domain) {
		List<User> users = userService.getConfigdetails();
		String domainName = "";
		Iterator<User> itr = users.iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			domainName = user.getDomain();
			
			if(users.contains("12") && domainName.equals("12")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.OK);
			} else if(domain.equals("18") && domainName.equals("18")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.NO_CONTENT);
			} else if(domain.equals("24") && domainName.equals("24")) {
				return new ResponseEntity<List<User>>(users, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
			}
			System.out.println("The Domain Name is " + domain + " .... " + domainName);
			
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}