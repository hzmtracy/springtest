package com.tk.springtest.web.controller;

import com.github.pagehelper.PageHelper;

import com.tk.springtest.web.po.Employee;
import com.tk.springtest.web.service.EmployeesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class EmployeesController {
    private final Logger LOGGER = LogManager.getLogger(EmployeesController.class);
    @Autowired
    private EmployeesService employeesService;


    @GetMapping
    public List<Employee> findEmpList(){
        /* 手动设置分页*/
        PageHelper.startPage(1, 3, true);
        return employeesService.findEmpList();
    }

    @RequestMapping("/message/{currentPage}")
    public String message(@PathVariable("currentPage") Integer currentPage, Model model){
        if(currentPage!= null){
            PageHelper.startPage(currentPage, 11);
        }
        LOGGER.debug("程序执行的时候输出Log日志...");
//        List<Message> messages = messageService.list();
        model.addAttribute("messages", 1);
        return "message";
    }
}
