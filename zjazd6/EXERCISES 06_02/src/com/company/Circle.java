/*
 * SUMMARY: Exercises 06_02; Implement the following UML chart.
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Circle implements GeometricObject {
    protected double radius=1.0;
    public Circle (double radius){
        this.radius=radius;
    }
    public double getPerimeter(){
        return 2*3.14*this.radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + this.radius + "}";
    }
}
