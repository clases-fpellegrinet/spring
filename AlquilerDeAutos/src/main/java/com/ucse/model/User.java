package com.ucse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
		@Id
		@Column(name="dni")
	    private Long dni;
	    @Column(name="name")
	    private String name;
	    @Column(name="mail")
	    private String mail;
	    public User() {
	    }
	
	    public User(Long dni, String name, String mail) {
	        this.dni = dni;
	        this.name = name;
	        this.mail = mail;
	    }
	
	    public Long getDni() {
	        return dni;
	    }

	    public void setId(Long dni) {
	        this.dni = dni;
	    }
	
	    public String getName() {
	        return name;
	    }
	
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    public String getMail() {
	        return mail;
	    }
	
	    public void setMail(String mail) {
	        this.mail = mail;
	    }

}
