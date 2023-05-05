package com.example.javaSB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class javaController {

    @GetMapping({"/"})
    public String message(){
        return "Congrats you are in!";
    }
}
