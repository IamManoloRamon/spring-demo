package com.codewithmanoloramon.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student manolo = new Student(
                    "Manolo",
                    "manolo-ramon@outlook.com",
                    LocalDate.of(1976, APRIL, 30)
            );
            Student marcus = new Student(
                    "Marcus",
                    "marcus@outlook.com",
                    LocalDate.of(2004, JANUARY, 30)
            );
            Student shema = new Student(
                    "Shema",
                    "shena@outlook.com",
                    LocalDate.of(1980, OCTOBER, 23)
            );
            Student michael = new Student(
                    "Michael",
                    "michael@outlook.com",
                    LocalDate.of(1977, NOVEMBER, 26)
            );

            studentRepository.saveAll(
                    List.of(manolo, marcus, shema, michael)
            );
        };
    }
}
