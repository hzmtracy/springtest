package com.tk.springtest.web.dao.employee;

import com.tk.springtest.web.po.Employee;
import java.util.List;

public interface EmployeesMapper {
     List<Employee> findEmployees();
}
