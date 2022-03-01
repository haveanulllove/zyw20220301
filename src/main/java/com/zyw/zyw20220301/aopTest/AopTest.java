package com.zyw.zyw20220301.aopTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("aopTest")
//定义切面类
@Aspect
public class AopTest {

    @Pointcut("execution(* *.saying(..))")
    public void sayings(){
        System.out.println("123321");
    }



    @Before("sayings()")
    public void sayHello(){
        System.out.println("注解类型前置通知");
    }

    @After("sayings()")
    public void sayGoodBye(){
        System.out.println("注解类型后置通知");
    }
    //环绕通知。注意要有ProceedingJoinPoint参数传入。
    @Around("sayings()")
    public void sayAround(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println("注解类型环绕通知..环绕前");
        pjp.proceed();//执行方法
        System.out.println("注解类型环绕通知..环绕后");

    }



}
