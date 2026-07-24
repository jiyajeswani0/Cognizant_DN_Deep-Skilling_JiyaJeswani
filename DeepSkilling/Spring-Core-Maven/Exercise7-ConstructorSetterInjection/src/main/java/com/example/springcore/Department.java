package com.example.springcore;

public class Department {
    
    private String departmentName;

    // Constructor injection
    public Department(String deptName) {
        this.departmentName = deptName;
    }

    // Getter
    public String getDepartmentName() {
        return this.departmentName;
    }
}