package com.edu.murray.controller.com.edu.murray.com.edu.murray.controller;


import com.edu.murray.controller.com.edu.murray.MySqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * @author hp
 */

@RestController
@ResponseBody
public class HelloController {
    @Autowired
    private Environment env;

    @Autowired
    private MySqlDataSource dataSource;

    @GetMapping(value = "hello")
    public String hello(){
        System.out.println("Hello Murray!");
        System.out.println(env.getProperty("user1.age"));
        System.out.println(env.getProperty("user1.name"));
        System.out.println(dataSource.toString());
        return "{\"name\": \"Murray\", \"tempDir\": tempDir}";
    }
}
