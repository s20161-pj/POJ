/*
 * SUMMARY: "Exercise 16; Write a program to print the name, salary and date of joining of 8 employees in a company.Use arrayList of objects. "
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private String salary;
    private LocalDate date;

    public Employee(String name, String salary, LocalDate date) {
        this.name = name;
        this.salary=salary;
        this.date= date;
    }
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return "name:" + this.name + ", salary:" + this.salary + ", date:" + formatter.format(this.date) + " ";
    }
}
