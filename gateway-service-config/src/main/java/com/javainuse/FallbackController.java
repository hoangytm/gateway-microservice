package com.javainuse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PhanHoang
 * 7/19/2020
 */
@RestController
@RequestMapping(value = "fallback")
public class FallbackController {
    @GetMapping("/message")
    public String test() {
        return "hello friends, I am hoang and from Vietnam";
    }
}
