package com.ztt.springaop.springaop;

import com.ztt.springaop.springaop.dto.EmployeeDTO;
import com.ztt.springaop.springaop.service.EmployeeManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    private EmployeeManager manager;
    @Test
    public void contextLoads() {
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }

}
