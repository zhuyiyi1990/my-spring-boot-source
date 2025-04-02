package com.github.zhuyiyi1990.boot.controller;

import com.github.zhuyiyi1990.starter.service.StarterDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private StarterDemoService starterDemoService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        starterDemoService.sayHello();
        return ResponseEntity.ok("Hello world!!!");
    }

}