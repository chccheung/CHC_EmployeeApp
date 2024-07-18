package com.chc.employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import com.chc.employee_service.model.Employee;
import com.chc.employee_service.services.EmployeeServ;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeServ service;

    @GetMapping("/")
    public String welcomeMsg(){
        return "Welcome to Employee Management System!";
    }

    @PostMapping("/create")
    public String createEmpList(){
        service.firstTimeCreateEmp();
        return "Employee list created!";
    }

    @PostMapping("/employee")
    public Employee createEmp(@RequestBody Employee employee){
        return service.saveEmp(employee);
    }


    @GetMapping("/allemployee")
    public List<Employee> getAllEmployee(){
        return service.getAllEmp();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable final String id){
        return service.getEmpById(id);
    }


    @PatchMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
       return service.updateEmp(employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable final String id){
       return service.deleteEmp(id);
    }

    @GetMapping("/department/{id}")
    public List<Employee> getDepartEmployee(@PathVariable final String id){
        return service.getDepartEmp(id);
    }

    
}