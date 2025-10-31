package com.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework with Java Config");
    }

    @Bean
    public Student student() {
        return new Student(course());
    }
}
