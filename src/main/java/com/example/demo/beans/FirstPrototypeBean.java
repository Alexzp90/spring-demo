package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FirstPrototypeBean {
    private SecondPrototypeBean secondPrototypeBean;

    @Autowired
    public FirstPrototypeBean(SecondPrototypeBean secondPrototypeBean) {
        this.secondPrototypeBean = secondPrototypeBean;
    }

    @Lookup
    public SecondPrototypeBean getSecondPrototypeBean() {
        return secondPrototypeBean;
    }
}
