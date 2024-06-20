package com.budhathoki.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budhathoki.edu.model.Employee;
import com.budhathoki.edu.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository empRepository;
	public EmployeeServiceImpl(EmployeeRepository empRepository) {
		this.empRepository = empRepository;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional <Employee> employee= empRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Employee is not found :"+ id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public void deleteEmployeById(Long id) {
		empRepository.deleteById(id);

	}

	@Override
	public Employee updateEmployeeById(Employee employee) {
	    Long id = employee.getId(); // Get the ID from the employee object
	    Optional<Employee> existingEmployee = empRepository.findById(id);

	    if (existingEmployee.isPresent()) {
	        Employee updatedEmployee = existingEmployee.get();
	        updatedEmployee.setName(employee.getName()); // Update other properties as needed

	        return empRepository.save(updatedEmployee);
	    } else {
	        throw new RuntimeException("Employee is not found: " + id);
	    }
	}

	

}
