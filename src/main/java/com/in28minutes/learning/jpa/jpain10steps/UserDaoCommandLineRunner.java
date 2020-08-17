package com.in28minutes.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDaoService;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserDaoService userDaoService;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","User");
		userDaoService.insert(user);
//		log.info("id created from saving in db:"+id);
		log.info("value is inserted successfully");
		log.info(user.toString());
	}
}
