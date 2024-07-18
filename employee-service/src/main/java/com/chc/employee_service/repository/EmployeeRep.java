package com.chc.employee_service.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.chc.employee_service.model.Employee;
@Repository
public class EmployeeRep {
    private List<Employee> list = new ArrayList<>();

    public void createEmployee(){
        list.add(new Employee("1", "John", "1", "CSharp"));
        list.add(new Employee("2", "Mary", "1", "CSharp"));
        list.add(new Employee("3", "Ana", "2", "CSharp"));
        list.add(new Employee("4", "Sam", "2", "CSharp"));
    }

    public List<Employee> getAllEmployees(){
        return list;
    }

    public Employee save(Employee employee){
        Employee employeeSave = new Employee(employee.getId(), employee.getName(), employee.getDepartId(), employee.getSkills());
            list.add(employeeSave);
            return employeeSave;
    }

    public Employee findById(String id){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getId().equals(id)){
                return list.get(i);
            }
        }
        return null;
    }

    public List<Employee> findByDepartId(String departId){
        List<Employee> departEmp = new ArrayList<Employee>();
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getDepartId().equals(departId)){
                departEmp.add(list.get(i));
            }
        }
        return departEmp;
    }


    public Employee update(Employee employee){
        int idx=-1;
        String id="";
        for (int i=0; i < list.size(); i++){
            if (list.get(i).getId().equals(employee.getId())){
                id = employee.getId();
                idx = i;
                break;
            }
        }

        if (idx ==-1) {
            return null;
        }else{
            list.set(idx, employee);
            return employee;
        }
    }

    public String delete(String id){
        list.removeIf(x-> x.getId().equals(id));
        return id;
    }
}
