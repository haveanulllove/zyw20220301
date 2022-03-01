package com.zyw.zyw20220301.aopTest;

import org.springframework.stereotype.Component;

@Component("knight")
public class Knight {
    public void saying(){
        System.out.println("我是你爹（切点方法）");
    }
}
