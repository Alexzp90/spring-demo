package com.example.demo.service.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class.getSimpleName());

    private AccountDao accountDao;

    public AccountServiceImpl() {
        LOGGER.info("Create service bean");
    }

    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        LOGGER.info("Create service bean");
        this.accountDao = accountDao;
    }
}
