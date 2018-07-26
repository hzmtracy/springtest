package com.ztt.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeCRUDTransactionAspect {

    @Before("execution(* com.ztt.springaop.springaop.service.EmployeeManager.getEmployeeById(..))")
    public void getEmployeeById(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDTransactionAspect.getEmployeeById() : "
                + joinPoint.getSignature().getName());
    }
}
