package com.ztt.springaop.springaop;

import com.google.common.collect.Lists;
import com.ztt.springaop.springaop.service.EmployeeManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    private EmployeeManager manager;
    @Test
    public void contextLoads() {
//        manager.getEmployeeById(1);
//        manager.createEmployee(new EmployeeDTO());
//        manager.deleteEmployee(100);
        List<String> list = Lists.newArrayList();
        list.add("a");
        list.add("b");
        List<String> stringList = list;
        list = stringList.stream().filter(t->t.equals("b")).collect(Collectors.toList());
        stringList.forEach(System.out::println);
        list = list.stream().filter(t->t.equals("a")).collect(Collectors.toList());


        list.forEach(System.out::println);


    }

}
