package com.example.Employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employees.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

