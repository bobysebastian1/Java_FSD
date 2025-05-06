package com.example.Employees.service;

import lombok.RequiredArgsConstructor;

import java.lang.annotation.Annotation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.Employees.dto.EmployeeDTO;
import com.example.Employees.entity.Employee;
import com.example.Employees.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements Service {

	@Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        employee = employeeRepository.save(employee);
        BeanUtils.copyProperties(employee, dto);
        return dto;
    }

//    public EmployeeDTO getEmployeeById(Long id) {
//        Employee emp = employeeRepository.findById(id)
//            .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
//        EmployeeDTO dto = new EmployeeDTO();
//        BeanUtils.copyProperties(emp, dto);
//        return dto;
//    }

    public Page<EmployeeDTO> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable).map(emp -> {
            EmployeeDTO dto = new EmployeeDTO();
            BeanUtils.copyProperties(emp, dto);
            return dto;
        });
    }

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}
}

