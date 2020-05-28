package com.ezss.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String id;        //@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String username;
	
	private String password;
	
	private String name;
	
	



	public String getId() {	
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + "]";
	}
	
}
