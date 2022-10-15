package com.mcsv.hello.hello1.service;

public class Hello1Service {


    public String getWelcomeMessage(String name){
        return String.format("Welcome %s!", name);
    }
}
