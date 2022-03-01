package com.zyw.zyw20220301.aopTest.impl;

import com.zyw.zyw20220301.aopTest.HelloWorld;

public class HelloWorldImpl2 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("------22222------按下HelloWorld1.printHelloWorld()-----22222-------");

    }

    @Override
    public void doPrint() {
        System.out.println("------22222------打印HelloWorldImpl1-----22222------");
        return ;
    }
}
