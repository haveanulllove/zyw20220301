package com.zyw.zyw20220301.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/application.xml");
        Knight br = (Knight) ac.getBean("knight");
        br.saying();
    }
}
