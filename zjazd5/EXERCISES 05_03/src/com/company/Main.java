/*
 * SUMMARY: Exercises 05_03; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(3, 5, 6, 10, 4, 8);

        System.out.println(triangle.toString());
        double perimeter = triangle.getPerimeter();
        System.out.println(perimeter);
        System.out.println(triangle.getType());
    }
}

