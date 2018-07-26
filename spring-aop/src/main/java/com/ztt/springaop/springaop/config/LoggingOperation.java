package com.ztt.springaop.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = "com.ztt.springaop.springaop.aspect")
@Configuration
public class LoggingOperation {
}
