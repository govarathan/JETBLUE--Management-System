package com.jetblue_app2.services;

import java.util.List;

import com.jetblue_app2.entity.Employee;
import com.jetblue_app2.entity.Passenger;

public interface EmployeeService {

	public void saveEmployee(Employee emp);

	public List<Employee> listallEmp(Employee emp);

	public Employee updateOneEmp(long id);

	public void updateOneE(Employee emp);

	public void deleteOneEmp(long id);

}
