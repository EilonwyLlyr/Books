package com.eilonwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eilonwy.models.User;
import com.eilonwy.repositories.UserRepository;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		repository.save(new User("test", "test", "test"));
		
		System.out.println("Users found");
		System.out.println("-------------------");
		
		for(User user : repository.findAll()) {
			System.out.println(user);
		}
	}

	
}
