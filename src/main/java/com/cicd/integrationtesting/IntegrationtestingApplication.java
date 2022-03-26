package com.cicd.integrationtesting;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class IntegrationtestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationtestingApplication.class, args);

//		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(IntegrationtestingApplication.class, args);
//		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		/*String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}*/
	}

}
