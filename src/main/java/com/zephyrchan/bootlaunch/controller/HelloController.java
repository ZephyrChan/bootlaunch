package com.zephyrchan.bootlaunch.controller;

import com.zephyrchan.bootlaunch.model.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {

        //@AllArgsConstructor
        Account accountAsre = new Account(1L, "ere");

        //@Data
        accountAsre.setName("czf");
        //@Builder
        Account account1 = Account.builder().id(1L).name("ddd").build();

        System.out.println(accountAsre);
        //@Slf4j
        log.info("测试一下，account : " + account1);
        return "Hello world";
    }
}