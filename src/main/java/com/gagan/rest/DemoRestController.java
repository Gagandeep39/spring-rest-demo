package com.gagan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    /**
     * Add COde for "/hello"
     */
    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
}
