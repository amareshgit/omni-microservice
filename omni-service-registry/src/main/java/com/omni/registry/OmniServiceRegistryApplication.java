package com.omni.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OmniServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmniServiceRegistryApplication.class, args);
	}

}
