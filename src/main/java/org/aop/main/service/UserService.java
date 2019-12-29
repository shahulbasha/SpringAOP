package org.aop.main.service;

import java.util.List;

import org.aop.main.dao.UserAccountDAO;
import org.aop.main.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	UserAccountDAO dao;
	
	public List<UserAccount> getAccountDetails(){
		return dao.getAccountDetails();
	}

	public UserAccount getUserAccountDetails(int userId) {
		return dao.getUserAccountDetails(userId);
	}
}
