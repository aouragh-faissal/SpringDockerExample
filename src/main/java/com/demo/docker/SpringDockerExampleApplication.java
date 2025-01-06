package com.demo.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.docker.model.Post;
import com.demo.docker.repository.PostRepository;

@SpringBootApplication
public class SpringDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerExampleApplication.class, args);
	}
	
    @Bean
    CommandLineRunner startup(PostRepository repository) {
	      return args -> {
	          repository.save( new Post("title 1","Body 1 ") );
	          repository.save( new Post("title 2","Body 2 ") );
	          repository.save( new Post("title 3","Body 3 ") );
	          repository.save( new Post("title 4","Body 4 ") );
	          System.out.println("Database initialized!");
	      };
	  }

}
