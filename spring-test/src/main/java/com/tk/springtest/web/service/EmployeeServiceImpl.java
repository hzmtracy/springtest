package com.tk.springtest.web.service;


import com.tk.springtest.web.dao.employee.EmployeesMapper;
import com.tk.springtest.web.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;

    @Override
    public List<Employee> findEmpList() {
        return employeesMapper.findEmployees();
    }
}
