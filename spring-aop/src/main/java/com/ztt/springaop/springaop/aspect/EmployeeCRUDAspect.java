package com.ztt.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
/**
 * 建议之前(@Before)：在连接点之前执行但不能阻止执行流程进入连接点的建议（除非它抛出异常）。要使用此建议，请使用上面示例中使用的@Before注释。
 * 返回建议后(@AfterReturning)：在连接点正常完成后执行的建议：例如，如果方法返回而不抛出异常。要使用此建议，请使用@AfterReturning注释。
 * 抛出建议后(@AfterThrowing)：如果方法通过抛出异常退出，则执行建议。要使用此建议，请使用@AfterThrowing注释。
 * 建议之后(@After)：无论加入点退出的方式（正常或异常退货），都要执行建议。要使用此建议，请使用上面示例中使用的@After注释。
 * 围绕建议(@Round)：围绕连接点的建议，例如方法调用。这是最有力的建议。要使用此建议，请使用@Around批注。
 */
public class EmployeeCRUDAspect {

    @Before("execution(* com.ztt.springaop.springaop.service.EmployeeManager.getEmployeeById(..))")
    public void logBeforeV1(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }

    @Before(value = "execution(* com.ztt.springaop.springaop.service.EmployeeManager.*(..))")
    public void logBeforeV2(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.ztt.springaop.springaop.service.EmployeeManager.getEmployeeById(..))")
    public void logAfterV1(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.ztt.springaop.springaop.service.EmployeeManager.*(..))")
    public void logAfterV2(JoinPoint joinPoint)
    {
        System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
    }


    /**
     * around通知可以在方法调用之前和之后执行自定义行为,  priority(优先级) over before method
     * @param joinPoint
     * @throws Throwable
     */
    @Around("execution(*  com.ztt.springaop.springaop.service.EmployeeManager.getEmployeeById(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("Write code for before advise");

        joinPoint.proceed(); //continue to called method i.e. EmployeeManager.getEmployeeById()

        System.out.println("Write code for after advise");
    }

}
