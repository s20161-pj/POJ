/*
 * SUMMARY: Exercises 05_04; Design a MyRectangle class which is composed of two MyPoint instances as
 * its top-left and bottom-right corners. Draw the class diagrams, write the codes, and write the test drivers.
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class MyPoint {
    private int x = 0;
    private int y = 0;

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

    public double distance(int x, int y) {
        int xdiff = this.x - x;
        int ydiff = this.y - y;
        return Math.sqrt((xdiff * xdiff) + (ydiff * ydiff));
    }

    public double distance(MyPoint another) {
        int xdiff = this.x - another.getX();
        int ydiff = this.y - another.getY();
        return Math.sqrt((xdiff * xdiff) + (ydiff * ydiff));
    }

    public double distance() {
        int xdiff = this.x;
        int ydiff = this.y;
        return Math.sqrt((xdiff * xdiff) + (ydiff * ydiff));
    }
}
