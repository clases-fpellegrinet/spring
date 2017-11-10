package com.ucse.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ucse.model.User;

@Repository
public class UserDao {
	
	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
        this.entityManager = em;
    }
	
	@Transactional
	public void create(User user) {
		entityManager.persist(user);
	}

	@Transactional
	public void update(User user) {
		entityManager.merge(user);
	}
	
	public User getUserByDni(long dni) {
		return entityManager.find(User.class, dni);
	}

	@Transactional
	public void delete(long dni) {
		User user = getUserByDni(dni);
		if (user != null) {
			entityManager.remove(user);
		}
	}
}
