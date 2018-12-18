package com.Login.login.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.Login.login.entity.User;

//The repository component helps use store things to the database.
@Repository
@Transactional
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		//open transaction
		entityManager.persist(user);
		//Close transaction
		return user.getId();
		
	}
}
