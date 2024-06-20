package com.budhathoki.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budhathoki.edu.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {

}
