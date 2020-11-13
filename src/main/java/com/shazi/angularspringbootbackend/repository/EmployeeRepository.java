package com.shazi.angularspringbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shazi.angularspringbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
