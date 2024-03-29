package com.zephyrchan.bootlaunch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}