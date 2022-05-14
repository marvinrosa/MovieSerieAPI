package dev.marvinrosa.movieserieapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public String getExample(){
        return "\"{ mensaje:\" \"hola mundo\" }";
    }
}
