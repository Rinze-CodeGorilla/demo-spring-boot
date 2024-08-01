package nl.codegorilla.demospringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class PersonConfiguration {

    @Bean
    Person getPerson() {
        System.out.println("getPerson bean called");
        return new Person(0, "Rinze Smits", LocalDate.of(1979, 4, 15), new Address());
    }
}
