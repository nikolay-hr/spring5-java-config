package bg.mvr.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Niki
 */
@RestController
public class RootRestController {
    
    @RequestMapping(value = "/test")
    @ResponseBody
    public String response(){
        return "Ok";
    }
    
}
