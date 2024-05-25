package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JfsdKnowYouProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsdKnowYouProjectApplication.class, args);
		System.out.println("JFSD---SDP-03---Project---Know You");
	}

}
