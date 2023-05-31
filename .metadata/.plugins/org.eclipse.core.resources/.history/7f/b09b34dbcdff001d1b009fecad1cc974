package com.restApiEg.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restApiEg.Entities.User;
import com.restApiEg.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
  @Autowired
  private UserService userservice;
  
  @PostMapping("user")
  public ResponseEntity<User> saveUser(@RequestBody User user){
	  String id = UUID.randomUUID().toString();
	  user.setId(id);
	  User saveUser = userservice.saveUser(user);
	return new ResponseEntity<User>(saveUser, HttpStatus.CREATED);
	  
  }
  @GetMapping("/user")
  public ResponseEntity<List<User>> getAllUser(){
	  List<User> user = userservice.getAllUser();
	return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	  
  }
  
  @GetMapping("{id}")
  public ResponseEntity<User> getUserBYiD(@PathVariable(name="id") String id) {
	  System.out.println(id);
	  User userById = userservice.getUserById(id);
	 return new  ResponseEntity<User>(userById, HttpStatus.OK);
  }
  @PutMapping("{id}")
  public  ResponseEntity<User> updateUser(@RequestBody User user ,@PathVariable(name = "id") String id){
	  User user1 = userservice.updateUser(user, id);
	  
	return new ResponseEntity<User>(user1, HttpStatus.OK);
	  
 }
//  @GetMapping("/{name}")
//  public ResponseEntity<List<User> > getUserBYname(@PathVariable(name="name") String name) {
//	 
//	  List<User> userByname = userservice.getUserByname(name);
//	 return new  ResponseEntity<List<User> >(userByname, HttpStatus.OK);
//  }
  

  
  
  
}
