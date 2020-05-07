/*
 * SUMMARY: Exercises 05_04; Design a MyRectangle class which is composed of two MyPoint instances as
 * its top-left and bottom-right corners. Draw the class diagrams, write the codes, and write the test drivers.
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1,5,8,1);
        System.out.println(rect1.toString());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getArea());
    }
}
