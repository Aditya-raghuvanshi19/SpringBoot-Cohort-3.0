package com.cohort30.bean.and.dependency.injection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Apple {

    void eatApple(){
        System.out.println("i am eating apple");
    }

    @PostConstruct
    void callthisbeforeappleisused(){
        System.out.println("creating a bean of the apple");
    }

    @PreDestroy
    void callthisbeforedistroy(){
        System.out.println("apple is destroyed");
    }
}
