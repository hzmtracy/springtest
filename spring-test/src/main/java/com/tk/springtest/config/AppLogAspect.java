package com.tk.springtest.config;

import com.tk.springtest.utils.IPUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;


@Component
@Aspect
@Order(-5)
public class AppLogAspect {
    private Logger logger = LogManager.getLogger(AppLogAspect.class);
    // 保证每个线程都有一个单独的实例
    private ThreadLocal<Long> time = new ThreadLocal<>();

    @Pointcut("execution(* com.tk.springtest.web.controller.*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        time.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //记录请求的内容
        logger.info("Request URL: " + request.getRequestURL().toString());
        logger.info("Request Method: " + request.getMethod());
        String ip = request.getRemoteAddr();
        if (ip.indexOf(":0") > -1) {
            ip = IPUtil.getRealIp();
        }
        logger.info("IP: " + ip);
        logger.info("User-Agent: " + request.getHeader("User-Agent"));
        logger.info("Class Method: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("Cookies: " + request.getCookies());
        logger.info("Params: " + Arrays.toString(joinPoint.getArgs()));
        Enumeration<String> enums = request.getParameterNames();
        while (enums.hasMoreElements()) {
            String paraName = enums.nextElement();
            logger.info(paraName + ":" + request.getParameter(paraName));
        }
    }
    @AfterReturning("pointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        logger.info("耗时 : " + ((System.currentTimeMillis() - time.get())) + "ms");
        logger.info("AppLogAspect.doAfterReturning()");
    }


}
