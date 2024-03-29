package com.cts.srcmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.srcmed.model.User;
@Repository
public interface UserLoginRepo extends JpaRepository<User, Integer> {
	public User findByUsername(String username);
	
	public Object existsByUsername(String username);
}
