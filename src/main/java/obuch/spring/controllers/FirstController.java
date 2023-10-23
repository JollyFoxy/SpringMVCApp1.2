package obuch.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String  helloPage(@RequestParam(value = "name", required = false)String name,
                             @RequestParam(value = "surname", required = false)String surname){

        System.out.print("Hello" + " " +name+ " " + surname);

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String  goodByePage(){
        return "first/goodbye";
    }

}
