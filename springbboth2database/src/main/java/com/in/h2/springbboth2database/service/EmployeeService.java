package com.in.h2.springbboth2database.service;

import java.util.List;
import java.util.Optional;

import com.in.h2.springbboth2database.pojo.Employee;

public interface EmployeeService {
	
	List<Employee> getaal();
	Employee saveemployee(Employee employee);
	Optional<Employee> getbyidEmployee(int id);
	Employee updateEmployee(Employee employee);
	void deleteEmployee(int id);


}
