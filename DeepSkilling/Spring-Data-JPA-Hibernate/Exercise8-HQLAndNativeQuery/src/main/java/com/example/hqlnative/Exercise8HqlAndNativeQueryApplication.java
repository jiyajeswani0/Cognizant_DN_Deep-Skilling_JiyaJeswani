package com.example.hqlnative;

import com.example.hqlnative.entity.Employee;
import com.example.hqlnative.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise8HqlAndNativeQueryApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(Exercise8HqlAndNativeQueryApplication.class, args);
    }

    @Override
    public void run(String... args) {

        employeeService.saveEmployee(new Employee(999, "Gopal Varshney", "Engineering"));
        employeeService.saveEmployee(new Employee(888, "John Doe", "Management"));

        System.out.println("\n===== 1. HQL QUERY RESULT =====");
        for (Employee employee : employeeService.showEmployeesUsingHQL()) {
            System.out.println(employee);
        }

        System.out.println("\n===== 2. NATIVE SQL QUERY RESULT =====");
        for (Employee employee : employeeService.showEmployeesUsingNativeQuery()) {
            System.out.println(employee);
        }
        System.out.println("======================================\n");
    }
}