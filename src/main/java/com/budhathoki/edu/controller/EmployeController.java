package com.budhathoki.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.budhathoki.edu.model.Employee;
import com.budhathoki.edu.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class EmployeController {
	@Autowired
	private EmployeeService empService;
@GetMapping("/employee")
public List <Employee> getAllEmployee() {
	return empService.getAllEmployee();
}
@GetMapping("/employee{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
	return empService.getEmployeeById(id);
}
@PostMapping("/employee")
public Employee saveEmployee( @Valid@RequestBody Employee employee) {
	return empService.saveEmployee(employee);
	
}
@PutMapping("/employee/{id}")
public Employee updateEmployeeById(@PathVariable Long id, @RequestBody Employee employee) {
    employee.setId(id); // Set the ID from the URL path into the Employee object
    return empService.updateEmployeeById(employee);
}

@DeleteMapping("/employee{id}")
public void deleteEmployeeById(@PathVariable Long id) {
	empService.deleteEmployeById(id);
	
}

}
