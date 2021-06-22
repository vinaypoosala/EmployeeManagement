package com.employee.vinay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.vinay.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
}
