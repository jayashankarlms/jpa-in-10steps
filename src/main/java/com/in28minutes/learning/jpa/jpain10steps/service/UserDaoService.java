package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDaoService {

	@PersistenceContext//it will track the user if we set it as persistence context
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
