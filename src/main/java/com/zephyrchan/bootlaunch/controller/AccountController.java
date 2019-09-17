package com.zephyrchan.bootlaunch.controller;


import com.zephyrchan.bootlaunch.model.Account;
import com.zephyrchan.bootlaunch.service.IAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private IAccountService accountService;


    @PostMapping("/save")
    public Account save(@RequestBody Account account){

        Account save = accountService.save(account);
        return save;
    }
}
