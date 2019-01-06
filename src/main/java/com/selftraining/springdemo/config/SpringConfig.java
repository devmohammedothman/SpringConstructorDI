package com.selftraining.springdemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.selftraining.springdemo.DBConnection;
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
		
		/*
		 * Injection of Literal values and read it from properties file
		 * */
		//Retrieve bean from spring container
		
		DBConnection con = ctx.getBean("connectionDB", DBConnection.class);
		
		//read properties values
		System.out.println("DB Con User Name :"+con.getUserName());
		System.out.println("\nDB Con Password :"+con.getPassword());
		
		
		//close context
		ctx.close();
		
		
	}

}
