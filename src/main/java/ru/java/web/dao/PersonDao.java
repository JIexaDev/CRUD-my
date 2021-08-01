package ru.java.web.dao;

import org.springframework.stereotype.Component;
import ru.java.web.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Alex"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Charlie"));
        people.add(new Person(4, "Den"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
