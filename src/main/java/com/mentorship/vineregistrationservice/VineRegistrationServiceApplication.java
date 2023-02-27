package com.mentorship.vineregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VineRegistrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VineRegistrationServiceApplication.class, args);
    }

}
