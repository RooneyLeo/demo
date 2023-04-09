package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * something to do
 *
 * @author Ray lei
 * @date 2023/4/9 11:54
 */
@RestController
public class TestController {


    @GetMapping("getTesting")
    public Object getTesting() {
        return 1;
    }
}
