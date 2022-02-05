package com.example.demoblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoblogApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoblogApplication.class, args);
    }
}
