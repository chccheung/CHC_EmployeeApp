package com.chc.employee_service.services;

import com.chc.employee_service.repository.EmployeeRep;
import com.chc.employee_service.model.Employee;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServ {
    @Autowired
    private EmployeeRep rep;


    public void firstTimeCreateEmp(){
         rep.createEmployee();
    }

    public Employee saveEmp(Employee employee){
        return rep.save(employee);
    }

    public List<Employee> getAllEmp(){
        return rep.getAllEmployees();
    }

    public Employee getEmpById(String id){
        return rep.findById(id);
    }
    
    public String deleteEmp(String id){
        rep.delete(id);
        return "Employee with id " + id + " removed.";
    }

    public Employee updateEmp(Employee employee){
        return  rep.update(employee) ;
    }

    public List<Employee> getDepartEmp(String departId){
        return rep.findByDepartId(departId);
    }
}
