package com.Login.login.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.login.dao.UserDAO;
import com.Login.login.model.User;
import com.Login.login.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	public void storeUserToDB(User user) {
		
		userDAO.saveUser(user.getId(), user.getName(), user.getPassword());
		
	}
	
	
	
//	public void loginUser(User user) {
//		
//	}
}
