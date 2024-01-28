package com.tech.kj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerReg1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerReg1Application.class, args);
	}
}
