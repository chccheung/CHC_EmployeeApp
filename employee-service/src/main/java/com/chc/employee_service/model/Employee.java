package com.chc.employee_service.model;

public class Employee{
    private final String id;
    private final String name;
    private final String departId;
    private final String skills;

    public Employee(final String id, final String name, final String departId, final String skills){
        this.id = id;
        this.name = name;
        this.departId = departId;
        this.skills = skills;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartId(){
        return this.departId;
    }

    public String getSkills(){
        return this.skills;
    }
}