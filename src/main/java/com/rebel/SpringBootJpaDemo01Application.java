package com.rebel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rebel.exception.InvalidPersonIdException;
import com.rebel.model.Person;
import com.rebel.repo.PersonRepo;
import com.rebel.service.PersonService;

@SpringBootApplication
public class SpringBootJpaDemo01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootJpaDemo01Application.class, args);
		PersonService personService = ctxt.getBean(PersonService.class);
//		Person p1 = personService.savePerson(new Person("Ram", "ram@ayodya.com"));
//		System.out.println("Saved successfully "+p1);
		
		Person p1;
		try {
			p1 = personService.findPersonById(101);
			System.out.println(p1);
		} catch (InvalidPersonIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
