package com.ucse.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	private final static DateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	@Id
	@Column(name="dni")
    private Long dni;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="birthdate")
    private Date birthdate;
    public User() {
    }

    public User(Long dni, String firstname, String lastname, String email, String birthdate) throws ParseException {
        this.dni = dni;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.birthdate = FORMAT.parse(birthdate);
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
    
    public String getBirthdate() {
    	return FORMAT.format(birthdate);
    }
    
    public void setBirthdate(String birthdate) throws ParseException {
    	this.birthdate = FORMAT.parse(birthdate);
    }

}
