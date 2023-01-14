package com.example.restProject.repository;

import com.example.restProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public abstract List<Employee> findByAge(Integer age);
}
