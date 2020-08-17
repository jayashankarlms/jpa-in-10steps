package com.in28minutes.learning.jpa.jpain10steps.userInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
