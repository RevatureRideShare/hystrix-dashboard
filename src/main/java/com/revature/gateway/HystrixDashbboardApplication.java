package com.revature.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class
HystrixDashbboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashbboardApplication.class, args);
	}

}
