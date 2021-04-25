package com.akshat.rest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student akshat = new Student(
                    1L,
                    "Name 1",
                    "name1@email.com",
                    LocalDate.of(2000, Month.APRIL, 6)
            );
            Student aashu = new Student(
                    2L,
                    "Name 2",
                    "email2@email.com",
                    LocalDate.of(2000, Month.APRIL, 6)
            );

            repository.saveAll(
                    Arrays.asList(akshat, aashu)
            );
        };
    }
}