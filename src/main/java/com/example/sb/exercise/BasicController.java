package com.example.sb.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ex")
public class BasicController {
    @GetMapping("/hello")      //localhost:8090/sb/ex/hello
    public String hello(){
        return "exercise/hello";    //hello.html부르기

    }

    @GetMapping("/noHtml")
    @ResponseBody
    public String noHtml(){
        return "<h1>Hello Spring Boot!!!</h1>";
    }

    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:/ex/hello";
    }

    @GetMapping("/params")
    public String params(Model model){
        model.addAttribute("name", "James");
        return "exercise/params";
    }
}
