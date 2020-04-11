
/*
 * SUMMARY: Exercises 22; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        Point point2 = new Point(1.1f, 2.2f);
        float[] xy = point2.getXY();
        System.out.println("(x,y)=" + xy[0] + ", " + xy[1]);

        MovablePoint movablePoint = new MovablePoint(1.1f, 2.1f, 1f, 2f);
        System.out.println(movablePoint.toString());
        MovablePoint movablePoint2 = new MovablePoint(1.1f, 2.1f, 1f, 2f);
        movablePoint2.move();
        System.out.println(movablePoint2.toString());
    }
}

