/*
 * SUMMARY: "Exercise 15;Implement the following UML chart."
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class TestTime {

    public static void main(String[] args) {
        Time time=new Time(1,20,59);
        System.out.println(time.toString());
        Time time2 = time.nextSecond();
        System.out.println(time2.toString());
        Time time3 = time.previousSecond();
        System.out.println(time3.toString());
    }
}
