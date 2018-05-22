package com.jurbin.workout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jurbin.workout"})
public class WorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutApplication.class, args);
    }
}
