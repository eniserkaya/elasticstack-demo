package com.eniserkaya.elasticstackdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void throwExceptionServiceForDemo(){
        throw new RuntimeException("Exception throwed");
    }
}
