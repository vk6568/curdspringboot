package com.in.h2.springbboth2database.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.h2.springbboth2database.pojo.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer> {

}
