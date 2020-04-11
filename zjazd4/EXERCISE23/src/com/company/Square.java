/*
 * SUMMARY: Exercises 23; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return "Square(" + "side=" + this.getSide() + ")";
    }
}