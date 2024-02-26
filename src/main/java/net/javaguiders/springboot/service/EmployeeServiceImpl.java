package net.javaguiders.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import net.javaguiders.springboot.model.Employee;
import net.javaguiders.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	}