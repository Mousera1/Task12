package com.example.hrtest;

import com.example.hr.*; //use the "import" statement to import the "com.example.hr" package and access the "Employee" class

public class EmployeeTest {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("vijay kumar", 12345, 75000.0);

        // Call methods to print name and salary
        employee.printName();
        employee.printSalary();
    }
}