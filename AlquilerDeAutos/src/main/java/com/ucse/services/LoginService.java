package com.ucse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ucse.dao.LoginDao;
import com.ucse.model.Login;

@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	public void create(Login login) {
		loginDao.create(login);
	}
	
	public Login getLogin(String username, String password) {
		return loginDao.getLogin(username, password);
	}
	
	public boolean isValidLogin(String username, String password) {
		return (getLogin(username, password) != null);
	}
}
