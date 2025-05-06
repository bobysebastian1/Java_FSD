package com.example.Employees.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.Employees.dto.EmployeeDTO;

public interface Service {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployeeById(Long id);
    Page<EmployeeDTO> getAllEmployees(Pageable pageable);
}
