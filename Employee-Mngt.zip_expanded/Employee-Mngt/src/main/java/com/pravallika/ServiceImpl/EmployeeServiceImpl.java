package com.pravallika.ServiceImpl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravallika.entity.Employee;
import com.pravallika.repository.EmployeeRepository;
import com.pravallika.service.EmployeeServiceRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServiceRepo {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee postEmployee(Employee s) {

		return employeeRepository.save(s);
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee params, int empId) {
		// TODO Auto-generated method stub
		Employee _employee = employeeRepository.findById(empId).get();
		_employee.setEmpName(params.getEmpName());
		_employee.setEmpAge(params.getEmpAge());
		_employee.setEmpEmail(params.getEmpEmail());
		_employee.setEmpMobile(params.getEmpMobile());
		return employeeRepository.save(_employee);
	}

	@Override
	public String deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empId);
		return "the employee with id " + empId + " has been deleted...";
	}

}