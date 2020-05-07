/*
 * SUMMARY: Exercises 05_05; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Customer {
    private int ID;
    private String name;
    private int discount;
    public Customer(int ID, String name, int discount){
        this.ID=ID;
        this.name=name;
        this.discount=discount;
    }

    public int getID() {
        return this.ID;
    }
    public String getName() {
        return this.name;
    }
    public int getDiscount(){
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public String toString() {
        return this.name+"("+this.ID+")";
    }
}