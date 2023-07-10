package com.package6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClass {
    MyService service;

    public MyService getService() {
        return service;
    }

    @Autowired
    public void setService(MyService service) {
        System.out.println("setservice setter method called");
        this.service = service;
    }
}