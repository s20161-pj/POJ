package com.company;

/*
 * SUMMARY: Exercises 23; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled) {
        super(color,filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle(" + "width=" + this.width + ", length=" + this.length + ")";
    }
}
