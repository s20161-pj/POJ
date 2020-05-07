/*
 * SUMMARY: Exercises 05_02; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint();
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.getCenterX();
    }

    public void setCenterX(int x) {
        this.setCenterX(x);
    }

    public int getCenterY() {
        return this.getCenterY();
    }

    public void setCenterY(int y) {
        this.setCenterY(y);
    }

    public int[] getCenterXY() {
        return this.getCenterXY();
    }

    public void setCenterXY(int x, int y) {
        this.setCenterX(x);
        this.setCenterY(y);
    }

    public String toString() {
        return "MyCircle[radius=" + this.radius + ",center=" + this.center.toString() + "]";
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * this.radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }
}

