package com.budhathoki.edu.service;

import java.util.List;

import com.budhathoki.edu.model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployee();
Employee getEmployeeById(Long id);
Employee saveEmployee(Employee employee);
Employee updateEmployeeById(Employee employee);
void deleteEmployeById(Long id);

}
