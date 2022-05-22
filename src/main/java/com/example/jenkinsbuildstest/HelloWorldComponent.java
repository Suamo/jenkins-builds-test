package com.example.jenkinsbuildstest;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorldComponent {

    @PostConstruct
    public void hello() {
        throw new RuntimeException("Not working!");
    }

}
