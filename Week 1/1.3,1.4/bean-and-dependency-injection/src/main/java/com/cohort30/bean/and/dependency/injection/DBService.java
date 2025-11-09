package com.cohort30.bean.and.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
//    DevDB devDB;
//
//    @Autowired
//    ProdDB prodDB;

    //these types of the DI is known as field injection
//    @Autowired
//    DB db;

    //final property will not work with autowire as we have to initialise the field either by static or by the constructor
    final private DB db;
    //constructor injection
    // the best is the construction because it provide us the more security as we can mark the properties as final so that no one can change that leter so best practice is use constructor
    public DBService(DB db){
        this.db=db;
    }

    //if the field is uses more in leter part of the class and you have to initialise some field as more secure by final use the constructor DI

    String getData(){
      return db.getData();
    }
}
