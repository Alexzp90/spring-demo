package com.example.demo.service.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SecondAccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecondAccountServiceImpl.class.getSimpleName());

    private AccountDao accountDao;

    public SecondAccountServiceImpl() {
        LOGGER.info("Create service bean");
    }

    @Autowired
    public SecondAccountServiceImpl(AccountDao accountDao) {
        LOGGER.info("Create service bean");
        this.accountDao = accountDao;
    }
}
