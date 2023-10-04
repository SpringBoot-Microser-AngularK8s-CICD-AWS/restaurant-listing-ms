package com.codeddecode.restaurantlisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Controller going to get all Reset End-point.interaction with client
//Server going to get all your business  logic.
//repo to connect with database
//dto : data transfer object w
public class RestaurantListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantListingApplication.class, args);
	}

}
