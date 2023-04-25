package com.example.skyprospringhomework210.service;

import com.example.skyprospringhomework210.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee getEmployeeWithMaxSalaryForDepartment(String department);
    Employee getEmployeeWithMinSalaryForDepartment(String department);
    List<Employee> printEmployeesListForDepartment(String department);
    Map<String, List<Employee>> printEmployeesListByDepartment();
}
