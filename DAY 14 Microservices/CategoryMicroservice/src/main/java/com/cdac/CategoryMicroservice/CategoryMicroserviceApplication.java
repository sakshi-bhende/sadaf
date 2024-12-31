package com.cdac.CategoryMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.cdac.CategoryMicroservice.controller",
"com.cdac.CategoryMicroservice.services"})
@EntityScan(basePackages = {"com.cdac.CategoryMicroservice.entity"})
@EnableJpaRepositories(basePackages = {"com.cdac.CategoryMicroservice.repository"})
public class CategoryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryMicroserviceApplication.class, args);
	}

}
