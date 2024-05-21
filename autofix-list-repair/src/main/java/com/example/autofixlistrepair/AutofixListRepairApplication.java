package com.example.autofixlistrepair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AutofixListRepairApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutofixListRepairApplication.class, args);
    }

}
