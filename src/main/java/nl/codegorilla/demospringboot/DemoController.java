package nl.codegorilla.demospringboot;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200,http://127.0.0.1:4200")
@RestController
public class DemoController {
    List<Person> people = new ArrayList<Person>();

    DemoController(Person person) {
        System.out.println("DemoController Constructor called");
        this.people.add(person);
    }

    @GetMapping()
    public String hello() {
        return "<h1>Hello</h1> World";
    }

    @GetMapping("/persons")
    List<Person> getPersons() {
        return people;
    }

    @GetMapping("/persons/{id}")
    Person getPerson(@PathVariable int id) {
        return people.get(id);
    }

    @PostMapping("/persons")
    void addPerson(@RequestBody Person person) {
        people.add(new Person(people.size(), person.name(), person.birthday(), person.address()));
    }
}

record Person(int id, String name, LocalDate birthday, Address address) {
}

class Address {
    int houseNumber = 12;
    public String getStreetName() {
        return "Gedempt Zuiderdiep";
    }
    public int getHouseNumber() {
        return houseNumber;
    }
}