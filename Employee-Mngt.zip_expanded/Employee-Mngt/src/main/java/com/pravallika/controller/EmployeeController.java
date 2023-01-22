package com.pravallika.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravallika.entity.Employee;
import com.pravallika.service.EmployeeServiceRepo;

import jakarta.validation.Valid;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceRepo employeeServiceRepo;

	// add a student (no ResponseEntity)
	@PostMapping(value = "/employees")
	public Employee addController(@RequestBody Employee employee)   {
		return employeeServiceRepo.postEmployee(employee);
	}

	// get a student
	@GetMapping(value = "/employees/{empId}")
	public Employee getController(@PathVariable int empId) {
		return employeeServiceRepo.getEmployee(empId);
	}

	// get all students
	@GetMapping(value = "/employees")
	public List<Employee> getAllController() {
		return employeeServiceRepo.getAllEmployees();
	}

	// update a student
	@PutMapping(value = "/employees/{empId}")
	public Employee updateController(@PathVariable int empId, @RequestBody Employee employee) {
		return employeeServiceRepo.updateEmployee(employee, empId);
	}

	// delete a student

	@DeleteMapping(value = "/employees/{id}")
	public String deleteController(@PathVariable int id) {
		return employeeServiceRepo.deleteEmployee(id);
	}

	// add a student (with ResponseEntity)
	@PostMapping("/employeeValid")
	public ResponseEntity<Employee> addValidEmployee(@Valid @RequestBody Employee p) {
		Employee savedEmployee = employeeServiceRepo.postEmployee(p);
		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);

	}
}