package com.in.h2.springbboth2database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.h2.springbboth2database.pojo.Employee;
import com.in.h2.springbboth2database.service.EmployeeserviceImpl;

@RestController
@RequestMapping("/Employee")
public class Employeecontroller {
	
	@Autowired
	EmployeeserviceImpl employeeserviceimpl;
	
	@GetMapping("/getallemployee")
	public List<Employee> getallemployee(){
		
		return employeeserviceimpl.getaal();
		
	}
   @PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeserviceimpl.saveemployee(employee);
	}
   @PutMapping("/update")
   public Employee UpdateEmployee(@RequestBody Employee employee) {
	   
	   return employeeserviceimpl.updateEmployee(employee);
   }
   @GetMapping("/getid/{id}")
   public Optional<Employee> getbyidEmployee(@PathVariable int id) {
	   
	   return employeeserviceimpl.getbyidEmployee(id);
   }
   @DeleteMapping("/deleteid/{id}")
   public void deleteEmployee(@PathVariable int id) {
	   
	   employeeserviceimpl.deleteEmployee(id);
   }
}
