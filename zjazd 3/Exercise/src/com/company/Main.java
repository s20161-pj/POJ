/*
 * SUMMARY: "Exercise 16; Write a program to print the name, salary and date of joining of 8 employees in a company.Use arrayList of objects. "
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>() {
            {
                add(new Employee("Karol", "2800", LocalDate.of( 2014 , 2 , 11 )));
                add(new Employee("Łucja", "2600", LocalDate.of( 2015 , 3 , 18 )));
                add(new Employee("Patryk", "3300", LocalDate.of( 2013 , 5 , 12 )));
                add(new Employee("Katarzyna", "4500", LocalDate.of( 2011 , 7 , 13 )));
                add(new Employee("Bartosz", "2900",LocalDate.of( 2010 , 8 , 14 )));
                add(new Employee("Mateusz", "2700", LocalDate.of( 2017 , 9 , 17 )));
                add(new Employee("Piotr", "3500", LocalDate.of( 2009 , 11 , 10 )));
                add(new Employee("Iza", "4300", LocalDate.of( 2016 , 12 , 23 )));
            }
        };

        int ilosc = employeeList.size();
        for (int i = 0; i < ilosc ; i++) {
            Employee empolyee = employeeList.get(i);
            System.out.println(empolyee.toString());
        }
    }
}