package br.com.dicasdeumdev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dicasdeumdev.api.domain.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		User User = new User(1,"William","william@email.com", "123456");
		System.out.println(User);
	}

}
