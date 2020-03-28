/*
 * SUMMARY: "Exercise 11;Implement the following UML chart. Create test class for each UML diagarm"
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary ) {       //kontruktor
        this.id=id;
        this.firstName=firstName;     //przypisanie wartosci pól
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID()        //metody
    {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getName(){
      return this.firstName+" "+this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
       return this.salary*12;
    }
    int raiseSalary(int percent) {
        double raiseSalary=(percent/100.0);
        this.salary= (int) (this.salary*(raiseSalary+1));
        return this.salary;
    }
    public String toString() {
        return "Employee[id="+this.id+",name="+this.firstName+" "+this.lastName+",salary="+this.salary+"]";

    }
}