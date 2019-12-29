package org.aop.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.aop.main")
@EnableAspectJAutoProxy
public class SpringConfig {

}
