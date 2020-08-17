package com.in28minutes.learning.jpa.jpain10steps.commandLineRunner;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.userInterface.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("value is saved through spring data jpa");
		Optional<User> userWithOptionalValue = userRepository.findById(1L);
		if(userWithOptionalValue.isPresent())
			log.info((userWithOptionalValue.get()).toString());
		List<User> userList = userRepository.findAll();
		log.info(userList.toString());
	}

}
