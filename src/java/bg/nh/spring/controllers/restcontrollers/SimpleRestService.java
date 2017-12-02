package bg.nh.spring.controllers.restcontrollers;

import bg.nh.spring.models.Person;
import bg.nh.spring.repositories.PersonRepositoryImp;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Niki
 */
@RestController
public class SimpleRestService {

    @Autowired
    private PersonRepositoryImp personRepositoryImp;
    
    @RequestMapping(value = "/getpersons", method = RequestMethod.GET)
    @ResponseBody
    public Set<Person> getPersons(){
        return personRepositoryImp.getPersons();
    }
    
    @RequestMapping(value = "/getpersons/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person getPersonById(@PathVariable("id") Long id){
        return personRepositoryImp.getPersonById(id);
    }
    
    @RequestMapping(value = "/getpersons/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Person getPersonByName(@PathVariable("name") String name){
        return personRepositoryImp.getPersonByName(name);
    }

}
