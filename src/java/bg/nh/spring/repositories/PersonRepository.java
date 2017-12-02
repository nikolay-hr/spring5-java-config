package bg.nh.spring.repositories;

import bg.nh.spring.models.Person;
import java.util.Set;

/**
 *
 * @author Niki
 */
public interface PersonRepository {

    Set<Person> getPersons();

    Person getPersonById(Long id);

    Person getPersonByName(String name);

    Person addPerson(String name, String email);
}
