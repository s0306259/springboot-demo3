package com.edu.murray.controller.com.edu.murray.com.edu.murray.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello spring boot!";
    }
}
