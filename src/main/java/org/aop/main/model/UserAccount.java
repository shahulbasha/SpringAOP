package org.aop.main.model;

import org.springframework.stereotype.Component;

@Component
public class UserAccount {
	
	private int userId;
	private String email;
	private String firstName;
	private String lastName;
	private int age;

	
	public UserAccount() {
		super();
	}

	public UserAccount(int userId, String email, String firstName, String lastName, int age) {
		super();
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + "]";
	}

	
}
