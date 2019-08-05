package com.in.h2.springbboth2database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.h2.springbboth2database.Dao.Employeerepository;
import com.in.h2.springbboth2database.pojo.Employee;

@Service
public class EmployeeserviceImpl implements EmployeeService {
	
	 @Autowired
     private Employeerepository employeerepository;
         
	@Override
	public List<Employee> getaal() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	public Employee saveemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

	@Override
	public Optional<Employee> getbyidEmployee(int id) {
		// TODO Auto-generated method stub
		return employeerepository.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.saveAndFlush(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(id);
		
	}
	

}
