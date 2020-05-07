/*
 * SUMMARY: Exercises 05_01; Implement the following UML chart
 * Write a program that allocates 10 points in an array of MyPoint, and
 * initializes to (1, 1), (2, 2), ... (10, 10).
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class MyPoint {
    protected int x = 0;
    protected int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    double distance(int x, int y) {
        int xdiff = this.x - x;
        int ydiff = this.y - y;
        return Math.sqrt((xdiff * xdiff) + (ydiff * ydiff));
    }
    double distance (MyPoint another){
        int xdiff = this.x - another.getX();
        int ydiff = this.y - another.getY();
        return Math.sqrt((xdiff * xdiff) + (ydiff * ydiff));
    }
    double distance ()
    {
        int xdiff=this.x;
        int ydiff=this.y;
        return Math.sqrt((xdiff*xdiff)+(ydiff+ydiff));
    }
}
