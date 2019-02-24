package com.example.demo.dao.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.service.impl.AccountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class AccountDaoImpl implements AccountDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class.getSimpleName());

    public AccountDaoImpl() {
        LOGGER.info("Create dao bean");
    }
}
