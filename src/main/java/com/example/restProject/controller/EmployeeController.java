package com.example.restProject.controller;

import com.example.restProject.entity.Employee;
import com.example.restProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired private EmployeeService service;

    @GetMapping("/employee-list")
    public List<Employee> getEmployee(){ return service.listAll(); }

    @PostMapping("/employee-save")
    public Employee saveEmployee(@RequestBody Employee employee){ return service.save(employee);
    }

    @GetMapping(path = "get/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id){
        return service.getById(id);
    }

    @GetMapping("/query")
    public List<Employee> getEmployeeByAge(@RequestParam("age") Integer age){
        return service.getByAge(age);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = service.deletingById(id);
        if (ok){
            return "Employee with Id("+id+") was deleted";
        } else {
            return "Employee with Id("+id+") was not enabled to delete ";
        }
    }
}
