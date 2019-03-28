package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private FirstPrototypeBean firstPrototypeBean;

    @Lookup
    public FirstPrototypeBean getFirstPrototypeBean() {
        return firstPrototypeBean;
    }
}
