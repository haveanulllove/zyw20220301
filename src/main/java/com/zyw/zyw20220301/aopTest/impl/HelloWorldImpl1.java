package com.zyw.zyw20220301.aopTest.impl;

import com.zyw.zyw20220301.aopTest.HelloWorld;

public class HelloWorldImpl1 implements HelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("------11111------按下HelloWorld1.printHelloWorld()-----11111111-------");

    }

    @Override
    public void doPrint() {
        System.out.println("------1111111------打印HelloWorldImpl1-----1111111------");
        return ;
    }
}
