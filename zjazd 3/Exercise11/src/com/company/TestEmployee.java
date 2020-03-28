/*
 * SUMMARY: "Exercise 11;Implement the following UML chart. Create test class for each UML diagarm"
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class TestEmployee {

    public static void main(String[] args) {
        int id=0;
        String firstName="Joanna";
        String lastName="Walkiewicz";
        int salary=2000;
        Employee employee = new Employee (id, firstName,lastName,salary);  //tworzenie nowego obiektu
        System.out.println(employee.toString());
        employee.setSalary(10000);
        System.out.println(employee.toString());
        employee.raiseSalary(30);
        System.out.println(employee.toString());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getID());
        System.out.println(employee.getLastName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }

}
