package com.restApiEg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApiEg.Entities.User;
import com.restApiEg.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	 private UserRepository userrepo;

	@Override
	public User saveUser(User user) {
	return	userrepo.save(user);
		 
	}

	@Override
	public List<User> getAllUser() {
		return userrepo.findAll();
		 
	}

	@Override
	public User getUserById(String id) {
		System.out.println(id);
		 User user = userrepo.findById(id).get();
		System.out.println(user.getEmail());
		 return user;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user,String id) {
		userrepo.findById(id);
		User user1=new User();
		user1.setId(user.getId());
		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setMobile(user.getMobile());
		User save = userrepo.save(user1);
		return save;
	}

	@Override
	public List<User>  getUserByname(String name) {
            List<User> findByName = userrepo.findByName(name);
		return findByName;
	}

}
