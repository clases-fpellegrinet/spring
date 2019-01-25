package com.ucse.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ucse.model.Login;

@Repository
public class LoginDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional
	public void create(Login login) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(login);
	}
	
	@Transactional
	public Login getLogin(String username, String password) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Login where username = :username and password = :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		return (Login) query.uniqueResult();
	}
}
