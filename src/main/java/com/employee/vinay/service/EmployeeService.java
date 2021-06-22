package com.employee.vinay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.vinay.entities.Employee;
import com.employee.vinay.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	
	public Employee saveEmployee(Employee employee) {
		
		return repo.save(employee);
	}


	public List<Employee> findAll() {
		
		return repo.findAll();
	}


	public Employee findById(int id) {
		
		Employee empl = repo.findById(id).get();
		
		return empl;
	}

	
	
}
