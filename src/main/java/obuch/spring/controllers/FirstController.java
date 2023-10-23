package obuch.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String  helloPage(@RequestParam(value = "name", required = false)String name,
                             @RequestParam(value = "surname", required = false)String surname,
                             Model model){

        model.addAttribute("massage", "Hello" + " " +name+ " " + surname + "\n");



        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String  goodByePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculation")
    public String Calculation (@RequestParam(value = "a")int a,
                               @RequestParam(value = "b")int b,
                               @RequestParam(value = "operation")String op,
                               Model model){
        double r = 0;

        switch (op){
            case "del":
                r = a/(double)b;
                break;
            case "raz":
                r = a-b;
                break;
            case "umn":
                r = a*b;
                break;
            case "sum":
                r = a+b;
                break;
        }

        model.addAttribute("result", "Result: "+r);
        return "first/calculation";
    }

}
