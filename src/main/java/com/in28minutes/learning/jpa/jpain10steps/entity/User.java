package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;

	//usually jpa expects parameter less constructor, if we use parameter constructor to overwrite the constructor
	protected User() {
		
	}
	
	//to set value in user table
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
}
