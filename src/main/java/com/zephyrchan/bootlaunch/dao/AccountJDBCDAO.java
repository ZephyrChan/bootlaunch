package com.zephyrchan.bootlaunch.dao;

import com.zephyrchan.bootlaunch.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AccountJDBCDAO {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Account account){
        jdbcTemplate.update("INSERT into account(name) value (?)",account.getName());
    }
}
