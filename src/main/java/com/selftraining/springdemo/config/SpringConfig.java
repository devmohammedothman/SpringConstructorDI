package com.selftraining.springdemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.selftraining.springdemo.Icoach;
import com.selftraining.springdemo.TennisCoach;

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
		
		//retreive another bean tennis coach to check setter injection
		TennisCoach tennisCoach = ctx.getBean("tennisCoach", TennisCoach.class);
		
		//call methods on tennis coach bean to check setter injection is done
		System.out.println(tennisCoach.checkTraineeHealth());
		
		//close context
		ctx.close();
		
		
	}

}
