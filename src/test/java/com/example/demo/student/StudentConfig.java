package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student mariam =new Student(
                    1L,
                    "Mariam",
                    "mariam@email.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student alex =new Student(
                    1L,
                    "Alex",
                    "alex@email.com",
                    LocalDate.of(2001, Month.APRIL,15)
            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
