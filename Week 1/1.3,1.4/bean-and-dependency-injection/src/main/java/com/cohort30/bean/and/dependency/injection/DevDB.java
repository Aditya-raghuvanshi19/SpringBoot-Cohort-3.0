package com.cohort30.bean.and.dependency.injection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // here we have to explicitly define the class as primary so that object of that class's object is map to the reference of the interface DB
//so better way is define the configuration into env or properties file and based on that the db is switch b/w dev or prod

@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB{

    public String getData(){
        return "development data";
    }
}
