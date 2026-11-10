package com.example.tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
