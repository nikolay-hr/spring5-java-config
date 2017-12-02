package bg.nh.spring.controllers.viewcontrollers;

import bg.nh.spring.repositories.PersonRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Niki
 */
@Controller
public class MainController {

    @Autowired
    private PersonRepositoryImp personRepositoryImp;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/persons")
    public String getPersons(Model model) {
        model.addAttribute("persons", personRepositoryImp.getPersons());
        return "persons";
    }

    @RequestMapping(value = "/addperson", method = RequestMethod.GET)
    public String addPerson(Model model) {
        return "addperson";
    }

    @RequestMapping(value = "/addperson", method = RequestMethod.POST)
    public String addPerson(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "email", required = true) String email,
            Model model) {
        personRepositoryImp.addPerson(name, email);
        model.addAttribute("persons", personRepositoryImp.getPersons());
        return "persons";
    }

}
