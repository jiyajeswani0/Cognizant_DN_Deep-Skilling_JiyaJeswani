package com.example.springcore;

public class Employee {

    // Injected via constructor
    private Department department;
    
    // Injected via setter
    private String employeeName;

    // Constructor Injection for Department
    public Employee(Department dept) {
        this.department = dept;
    }

    // Setter Injection for Name
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void displayDetails() {
        System.out.println("====== Employee Info ======");
        System.out.println("Name       : " + this.employeeName);
        System.out.println("Department : " + this.department.getDepartmentName());
        System.out.println("===========================");
    }

}