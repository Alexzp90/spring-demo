package com.example.demo.config;

import com.example.demo.service.AccountService;
import com.example.demo.service.impl.AccountServiceImpl;
import com.example.demo.service.impl.SecondAccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AccountService a1() {
        return new AccountServiceImpl();
    }

    @Bean
    public AccountService c1() {
        return new SecondAccountServiceImpl();
    }
}
