package com.jetblue_app2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetblue_app2.entity.Employee;
import com.jetblue_app2.respository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository  employeeRepo;
	
	@Override
	public void saveEmployee(Employee emp) {
		employeeRepo.save(emp);
	}
	@Override
	public List<Employee> listallEmp(Employee emp){
		List<Employee> employees = employeeRepo.findAll();
		return employees;
		
	}
	@Override
	public Employee updateOneEmp(long id) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}
	
	@Override
	public void  updateOneE(Employee emp) {
		employeeRepo.save(emp);
	}
	
	@Override
	public void deleteOneEmp(long id) {
		employeeRepo.deleteById(id);
	}

	
	
	
	
	
}
 