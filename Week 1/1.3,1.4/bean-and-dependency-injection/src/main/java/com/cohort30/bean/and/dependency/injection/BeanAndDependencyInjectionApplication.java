package com.cohort30.bean.and.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanAndDependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	Apple apple1;

	@Autowired
	Apple apple2;

	@Autowired
	DBService dbService;

//	@Autowired
//	DB db;

	public static void main(String[] args) {

		SpringApplication.run(BeanAndDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		apple1.eatApple();
//		apple2.eatApple();

		System.out.println(dbService.getData());
		//System.out.println(db.getData());
	}
}
