package com.lomejordeoax.rest.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service/")
public class UserController {
	
	//@Autowired
	//private UserService userServiceImp;
	
	@RequestMapping(value="/user/{username}/{password}/{email}",method = RequestMethod.GET,headers="Accept=application/json")
	public int addTask(@PathVariable String username,@PathVariable String password,@PathVariable String email) throws ParseException { 
	  
	  return 0;
	   
	  }


}
