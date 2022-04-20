package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        model.addAttribute("message", "Hello, "+name+" "+surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a") double a,
                            @RequestParam(value = "b") double b,
                            @RequestParam(value = "action") String action,
                            Model model) {
        double res=0;
        boolean ok = true;
        switch (action) {
            case "multiplication":
                res=a*b;
                break;
            case "addition":
                res=a+b;
                break;
            case "subtraction":
                res=a-b;
                break;
            case "division":
                res=a/b;
                break;
            default:
                ok=false;
                model.addAttribute("result", "incorrect action!");
                break;
        }
        if(ok)
            model.addAttribute("result", a+" "+action+" "+b+"="+res);
        return "first/resCalculator";
    }
}
