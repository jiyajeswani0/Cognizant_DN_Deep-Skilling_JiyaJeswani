package com.example.hqlnative.repository;

import com.example.hqlnative.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // 1. HQL (Queries the Java Class "Employee" directly)
    @Query("FROM Employee")
    List<Employee> getEmployeesUsingHQL();


    // 2. Native Query (Queries the raw SQL database table "employee")
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getEmployeesUsingNativeQuery();

}