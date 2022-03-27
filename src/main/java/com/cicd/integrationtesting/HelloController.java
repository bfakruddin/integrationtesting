package com.cicd.integrationtesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/check")
    public String check(){
        return "Check pass";
    }

    @GetMapping("/sum")
    @ResponseBody
    public int sum(@RequestParam int a, @RequestParam int b){
        return a+b;
    }
}
