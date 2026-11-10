package com.example.tp2.service;

import com.example.tp2.model.Employee;
import com.example.tp2.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // CREATE
    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    // READ
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //DELETE
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    // UPDATE
    public Employee updateEmployee(Long id, Employee emp) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        existingEmployee.setFirstName(emp.getFirstName());
        existingEmployee.setLastName(emp.getLastName());
        existingEmployee.setEmailId(emp.getEmailId());

        return employeeRepository.save(existingEmployee);
    }
}