package com.ucse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
	@Id
	@Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    Login(){}
    Login(String username, String password) {
    	this.username = username;
    	this.password = password;
    }
    
    public String getUsername() {
    	return this.username;
    }
    
    public String getPassword() {
    	return this.password;
    }
}
