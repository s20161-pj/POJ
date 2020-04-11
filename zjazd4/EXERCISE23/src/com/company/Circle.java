/*
 * SUMMARY: Exercises 23; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle(" + "radius=" + this.radius + ")";
    }
}
