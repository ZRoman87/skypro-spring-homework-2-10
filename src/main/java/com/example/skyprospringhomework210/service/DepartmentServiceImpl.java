package com.example.skyprospringhomework210.service;

import com.example.skyprospringhomework210.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeServiceImpl employeeService;
    private final Collection<Employee> employees;

    public DepartmentServiceImpl(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
        employees = employeeService.printEmployees();
    }

    @Override
    public Employee getEmployeeWithMaxSalaryForDepartment(String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }
    @Override
    public Employee getEmployeeWithMinSalaryForDepartment(String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .min(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }
    @Override
    public List<Employee> printEmployeesListForDepartment(String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .collect(Collectors.toList());
    }
    @Override
    public Map<String, List<Employee>> printEmployeesListByDepartment() {
        return employees.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment));
    }

}
