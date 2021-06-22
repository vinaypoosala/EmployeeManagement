package com.employee.vinay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.vinay.entities.Employee;
import com.employee.vinay.repository.EmployeeRepo;
import com.employee.vinay.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		
		return employeeService.findAll();
	}
	
	@GetMapping("/getEmpById/{id}")
	public Employee getEmpID(@PathVariable("id") int id) {
		
		return employeeService.findById(id);
	}
	
	/*
	 * 
	 * GET , POST , PUT , DELETE
	 */
}
