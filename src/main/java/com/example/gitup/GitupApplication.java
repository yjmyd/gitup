package com.example.gitup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitupApplication {

	public static void main(String[] args) {
		System.out.println("aaaa");
		SpringApplication.run(GitupApplication.class, args);
	}

	public void aa(){
    System.out.println("bb");
  }
}
