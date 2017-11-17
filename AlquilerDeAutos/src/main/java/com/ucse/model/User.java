package com.ucse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
		@Id
		@Column(name="dni")
	    private Long dni;
	    @Column(name="firstname")
	    private String firstname;
	    @Column(name="lastname")
	    private String lastname;
	    @Column(name="email")
	    private String email;
	    public User() {
	    }
	
	    public User(Long dni, String firstname, String lastname, String email) {
	        this.dni = dni;
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.email = email;
	    }
	
	    public Long getDni() {
	        return dni;
	    }

	    public void setId(Long dni) {
	        this.dni = dni;
	    }
	
	    public String getFirstname() {
	        return firstname;
	    }
	
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	
	    public String getLastname() {
	        return lastname;
	    }
	
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	
	    public String getEmail() {
	        return email;
	    }
	
	    public void setEmail(String email) {
	        this.email = email;
	    }

}
