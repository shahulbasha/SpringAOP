package org.aop.main;

import java.util.List;

import org.aop.main.model.UserAccount;
import org.aop.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
	    UserService service = context.getBean("userService", UserService.class);
	    //gets list of all available users
	    List<UserAccount> accountDetails = service.getAccountDetails();
	    //gets details of one user with the Id 1
	    UserAccount	account=service.getUserAccountDetails(1);	    
	    context.close();
	}

}
