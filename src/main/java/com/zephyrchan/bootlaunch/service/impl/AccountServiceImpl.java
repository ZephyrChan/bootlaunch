package com.zephyrchan.bootlaunch.service.impl;

import com.zephyrchan.bootlaunch.dao.AccountJDBCDAO;
import com.zephyrchan.bootlaunch.model.Account;
import com.zephyrchan.bootlaunch.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements IAccountService {
    @Resource
    private AccountJDBCDAO accountJDBCDAO;

    @Override
    public Account save(Account account) {
        accountJDBCDAO.save(account);
        return account;
    }
}
