/*
 * SUMMARY: Exercises 20; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Person {
    protected String name;
    protected String address;
    public Person(String name, String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String s = "Person[name=" + this.name + ",address=" + this.address + "]";
        return s;
    }
}