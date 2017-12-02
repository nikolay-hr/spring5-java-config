package bg.nh.spring.repositories;

import bg.nh.spring.models.Person;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Niki
 */
@Repository
public class PersonRepositoryImp implements PersonRepository {

    private final Set<Person> persons = new HashSet<>();

    public PersonRepositoryImp() {
        persons.add(new Person(1L, "Niki", "niki@mail.com"));
        persons.add(new Person(2L, "Ann", "ann@ana.na"));
        persons.add(new Person(3L, "Pesho", "pesho@abv.bg"));
    }

    @Override
    public Set<Person> getPersons() {
        return persons;
    }

    @Override
    public Person getPersonById(Long id) {
        return persons.stream().filter((person) -> person.getId().equals(id)).findAny().orElse(new Person());
    }

    @Override
    public Person getPersonByName(String name) {
        return persons.stream().filter((person) -> person.getName().equals(name)).findAny().orElse(new Person());
    }

    @Override
    public Person addPerson(String name, String email) {
        Person person = new Person(Long.valueOf(persons.size() + 1), name, email);
        persons.add(person);
        return person;
    }

}
