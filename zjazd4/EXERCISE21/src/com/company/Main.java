/*
 * SUMMARY: EXERCISES 21; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());

        Point2D point2D2 = new Point2D(1.0f, 2.0f);
        System.out.println(point2D2.toString());

        Point3D point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D.toString());


    }
}
