package com.jurbin.workout.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.jurbin.workout"})
public class WorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutApplication.class, args);
    }
}
