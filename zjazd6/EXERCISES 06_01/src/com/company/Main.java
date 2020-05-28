/*
 * SUMMARY: Exercises 06_01; Implement the following UML chart.
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        MovableRectangle movableRectangle=new MovableRectangle(0,0,10,5,2,2);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
    }
}
