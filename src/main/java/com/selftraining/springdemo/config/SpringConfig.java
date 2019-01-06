package com.selftraining.springdemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.selftraining.springdemo.Icoach;

public class SpringConfig {

	public static void main(String[] args) {
		
		
		//load spring config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//retreive bean from spring container
		//get coach object from bean created in config file
		Icoach coach = ctx.getBean("myCoach",Icoach.class);
		
		//call methods on bean
		System.out.println(coach.getDailyWorkOut());
		
		//check Constructor Injection done successfully
		System.out.println(coach.checkTraineeHealth());
		
		//close context
		ctx.close();
		
		
	}

}
