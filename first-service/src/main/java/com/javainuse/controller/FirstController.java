package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    public String test() throws Exception {

        throw new Exception("new exception from hoang");
    }
}
