package com.ztt.springaop.springaop.service;

import com.ztt.springaop.springaop.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeManager {
    EmployeeDTO getEmployeeById(Integer employeeId);

    List<EmployeeDTO> getAllEmployee();

    void createEmployee(EmployeeDTO employee);

    void deleteEmployee(Integer employeeId);

    void updateEmployee(EmployeeDTO employee);
}