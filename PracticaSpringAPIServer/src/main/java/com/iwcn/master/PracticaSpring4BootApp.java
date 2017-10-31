package com.iwcn.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories()
public class PracticaSpring4BootApp {

    public static void main(String[] args) {
        SpringApplication.run(PracticaSpring4BootApp.class, args);
    }

}
