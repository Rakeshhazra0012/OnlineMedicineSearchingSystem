package com.cts.srcmed.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.srcmed.exception.InvalidCredentialsException;
import com.cts.srcmed.exception.UserDoesNotExistException;
import com.cts.srcmed.model.User;
import com.cts.srcmed.repository.UserLoginRepo;
import com.cts.srcmed.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserLoginRepo userRepository;

    @Override
	public void login(String username, String password) {
		User user = userRepository.findByUsername(username);

		if (user == null) {
			throw new UserDoesNotExistException("User does not exist.");
		}

		if (!user.getPassword().equals(password)) {
			throw new InvalidCredentialsException("Invalid username or password.");
		}

		// Authentication successful
	}

    @Override
    public String getDesignation(String username) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            return user.getDesignation();
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean isUserAlreadyPresent(String username) {
        User user = userRepository.findByUsername(username);
        return user != null;
    }

	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public boolean isUserAlreadyPresent1(String username) {
		// TODO Auto-generated method stub
		return false;
	}
}
