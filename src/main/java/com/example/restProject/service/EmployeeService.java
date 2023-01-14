package com.example.restProject.service;

import com.example.restProject.entity.Employee;
import com.example.restProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired private EmployeeRepository repo;

    public List<Employee> listAll(){ return (List<Employee>) repo.findAll(); }
    public Employee save(Employee employee){ return repo.save(employee); }

    public Optional<Employee> getById(Long id){ return repo.findById(id); }

    public List<Employee> getByAge(Integer age){ return repo.findByAge(age); }

    public boolean deletingById(Long id){
        try{
            repo.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
}
