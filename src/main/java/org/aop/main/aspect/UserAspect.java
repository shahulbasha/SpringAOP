package org.aop.main.aspect;

import java.util.List;

import org.aop.main.model.UserAccount;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserAspect {

	@Pointcut("execution(* org.aop.main.service.*.getUserAccount*(..))")
	public void userPointcut() {}
	
	@AfterReturning(pointcut="userPointcut()",returning="result")
	public void executeAdvice(JoinPoint joinPoint,UserAccount result) {
		MethodSignature methodSignature=(MethodSignature)joinPoint.getSignature();
		Object[] args = joinPoint.getArgs();
		System.out.println("Arguments passed to the method "+methodSignature.getName()+" is "+args[0]);
		System.out.println("Logging details of user returned from database "+ result);
	}
}
