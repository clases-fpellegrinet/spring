package com.ucse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucse.dao.UserDao;
import com.ucse.model.User;

@Service
public class UsersService {
	@Autowired
	private UserDao userDao;
	
	public void create(User user) {
		userDao.create(user);
	}
}
