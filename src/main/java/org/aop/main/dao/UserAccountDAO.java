package org.aop.main.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.aop.main.model.UserAccount;
import org.springframework.stereotype.Component;

@Component
public class UserAccountDAO {
	List<UserAccount> accList=new ArrayList<UserAccount>();	
	

	@PostConstruct
	public void loadAccountList() {
		//Simulate a fetch from database
		accList.add(new UserAccount(1,"jack@gmail.com","Jack","Ryan",30));
		accList.add(new UserAccount(2,"sean@gmail.com","Sean","Mendes",30));
	}
	
	public List<UserAccount> getAccountDetails(){
		return accList;
	}

	public UserAccount getUserAccountDetails(int userId) {
		return accList.get(userId);
	}

}
