package com.budhathoki.edu.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

@Entity
@Table(name="Employee_Arlington")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@NotNull(message="Name cant be null")
private String name;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@NotBlank(message="please enter your address")
private String address;
@Column(name="NewSalary", nullable=false,unique=true)
private double salary=0d;
@CreationTimestamp
@Column(name="Created_time", nullable=false, updatable=false)
private Date createdAt;
@UpdateTimestamp
@Column(name="Updated_time")
private Date updatedAt;
}
