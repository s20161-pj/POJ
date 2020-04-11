/*
 * SUMMARY: Exercises 23; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Square square = new Square();
        System.out.println(square.toString());

    }
}
