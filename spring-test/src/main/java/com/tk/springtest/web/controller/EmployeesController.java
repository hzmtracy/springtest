package com.tk.springtest.web.controller;

import com.github.pagehelper.PageHelper;

import com.tk.springtest.web.po.Employee;
import com.tk.springtest.web.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping
    public List<Employee> findEmpList(){
        /* 手动设置分页*/
        PageHelper.startPage(1, 3, true);
        return employeesService.findEmpList();
    }

}
