package com.cts.srcmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan({"com.cts.srcmed"})
@EnableJpaRepositories({"com.cts.srcmed"})
public class srcmedApplication {

	public static void main(String[] args) {
		SpringApplication.run(srcmedApplication.class, args);
	}

}
