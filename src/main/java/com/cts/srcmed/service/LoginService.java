package com.cts.srcmed.service;

import java.util.List;

import com.cts.srcmed.model.User;

public interface LoginService {
	public void saveUser(User user);
	
	public String getDesignation(String username);
	boolean isUserAlreadyPresent(String username);
    public void login(String username, String password);
	void deleteUser(int userId);
	List<User> getAllUsers();
	boolean isUserAlreadyPresent1(String username);
}
