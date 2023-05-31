package com.restApiEg.services;

import java.util.List;

import com.restApiEg.Entities.User;


public interface UserService {
   User saveUser(User user);
   List<User> getAllUser();
   User getUserById(String id);
   String deleteUserById(String id);
   User updateUser(User user,String id);
   List<User>  getUserByname(String name);
   
}
