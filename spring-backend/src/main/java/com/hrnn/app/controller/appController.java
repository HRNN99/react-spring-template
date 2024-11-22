package com.hrnn.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

    @GetMapping("/prueba")
    String prueba (){
        return "Hola como estas?";
    }
}
