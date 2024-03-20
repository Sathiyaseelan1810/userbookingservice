package com.spring.user.bookingservice.userbookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class UserbookingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserbookingserviceApplication.class, args);
	}

}
