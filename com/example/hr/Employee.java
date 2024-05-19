package com.example.hr;

public class Employee {
    
    // Fields - name - a string that represents the employee's name. 
    //id - an integer that represents the employee's ID number. 
    //salary - a double that represents the employee's salary.
    private String name;
    private int id;
    private double salary;

    // Constructor 
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method - public void printName() - a method that prints the employee's name to the console.
    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    // Method - public void printSalary() - a method that prints the employee's salary to the console.
    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }

	/**/
}