package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student john = new Student(
                "John",
                "johnjo10@gmail.com",
                LocalDate.of(1999, Month.APRIL, 2)
            );
            Student maria = new Student(
                "Maria",
                "maria9876@gmail.com",
                LocalDate.of(1999, Month.SEPTEMBER, 2)
            );
            studentRepository.saveAll(
                List.of(john,maria)
            );
        };
    }
}
