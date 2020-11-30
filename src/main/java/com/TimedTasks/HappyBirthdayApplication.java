package com.TimedTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HappyBirthdayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyBirthdayApplication.class, args);
    }

}
