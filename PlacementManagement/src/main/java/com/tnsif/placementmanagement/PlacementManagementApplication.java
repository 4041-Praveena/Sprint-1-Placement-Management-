package com.tnsif.placementmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tnsif.placementmanagement.Company;

@SpringBootApplication
public class PlacementManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementApplication.class, args);
	}

}
