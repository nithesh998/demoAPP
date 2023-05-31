package com.restApiEg.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restApiEg.Entities.User;


public interface UserRepository extends JpaRepository<User, String> {
 List<User> findByName(String name);
}
