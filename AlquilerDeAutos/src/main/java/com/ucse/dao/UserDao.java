package com.ucse.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ucse.model.User;

@Repository
public class UserDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Transactional
	public void create(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}

	@Transactional
	public void update(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(user);
	}
	
	@Transactional
	public List<User> getUserByDni(long dni) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("from User").list();
	}

	@Transactional
	public void delete(long dni) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Long(dni));
		if(null != user){
			session.delete(user);
		}
	}
}
