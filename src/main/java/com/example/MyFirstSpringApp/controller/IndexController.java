package com.example.MyFirstSpringApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller // With this we configure this class into a Spring component, but in controller type
@RestController
public class IndexController {
    /*
     * A controller can has several methods, this methods will handle
     *  a page or a request http
     *
     *
     * We are going to mapping the path of where we will show the
     * controller. We can mapping more than one path using {/one_route, /two_route}
     * */
    @GetMapping("/index")
    public String index() {
        System.out.println("LOADING............\n");
        return "\"Hello, this is my first spring boot application\""; // return the name of the view
    }
}