package org.example.ayoubanafalcontrol;

import org.example.ayoubanafalcontrol.dao.Student;
import org.example.ayoubanafalcontrol.dao.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class AyoubAnafalControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyoubAnafalControlApplication.class, args);
    }
    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(new Student(null, "Alice Johnson", "alice.johnson@example.com", Date.valueOf("1998-05-12")));
            studentRepository.save(new Student(null, "Bob Smith", "bob.smith@example.com", Date.valueOf("2001-03-25")));
            studentRepository.save(new Student(null, "Charlie Brown", "charlie.brown@example.com", Date.valueOf("1999-11-08")));
            studentRepository.save(new Student(null, "Diana Prince", "diana.prince@example.com", Date.valueOf("2000-07-15")));

        };
    }

}
