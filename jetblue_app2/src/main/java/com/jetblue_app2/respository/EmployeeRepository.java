package com.jetblue_app2.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetblue_app2.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
