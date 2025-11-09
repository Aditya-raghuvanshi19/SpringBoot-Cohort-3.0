package com.cohort3.week1.homework.Week1homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {


    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting,Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }
    String bakeCake(){
        String frostringtype=frosting.getFrostingType();
        String syruptype = syrup.getSyrupType();

        return "having cake of: "+frostringtype + " and " + syruptype;
    }
}
