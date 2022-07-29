package com.rebel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rebel.model.Person;
import com.rebel.repo.PersonRepo;

@SpringBootApplication
public class SpringBootJpaDemo01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootJpaDemo01Application.class, args);
		PersonRepo personRepo = ctxt.getBean(PersonRepo.class);
		Person p1 = new Person("Kishor", "kishorgn@gmail.com");
		Person saved = personRepo.save(p1);
		System.out.println("Saved person object : "+saved);
	}

}
