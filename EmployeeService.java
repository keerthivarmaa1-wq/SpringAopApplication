
package com.examplle;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private int employeeId;
    private String employeeName;
    private double salary;

    public void addEmployee() {
        employeeId = 101;
        employeeName = "Sathya";
        salary = 25000.0;

        System.out.println("Employee added: " + employeeName);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}
