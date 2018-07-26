package com.ztt.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeCRUDLoggingAspect {
    @Before("execution(* com.ztt.springaop.springaop.service.EmployeeManager.*(..))")
    public void logBefore(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logBefore() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.ztt.springaop.springaop.service.EmployeeManager.*(..))")
    public void logAfter(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logAfter() : " + joinPoint.getSignature().getName());
    }
}
