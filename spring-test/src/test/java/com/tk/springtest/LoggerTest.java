package com.tk.springtest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public  void test(){
        System.out.println("2");
        logger.info("info...");
        logger.debug("debug...");
        logger.error("error...");
    }
}
