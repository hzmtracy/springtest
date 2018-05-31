package com.tk.springtest.web.service;


import com.tk.springtest.web.po.Employee;

import java.util.List;

public interface EmployeesService {

    /**
     * 获取列表
     * @return
     */
    List<Employee> findEmpList();
}
