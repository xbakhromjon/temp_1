package com.example.temp_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
public class Controller {
    @GetMapping
    public String status() {
        return "OK";
    }
}
