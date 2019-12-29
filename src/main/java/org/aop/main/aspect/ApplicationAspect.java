package org.aop.main.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ApplicationAspect {


	@Pointcut("execution(* org.aop.main.dao.*.*(..))")
	public void appPointcut() {}
	
	@Before("appPointcut()")
	public void executeDAOAdvice(JoinPoint joinpoint) {
		System.out.println("Started Logging for Application Aspect and user is authorized to get details from database");
	}
}
