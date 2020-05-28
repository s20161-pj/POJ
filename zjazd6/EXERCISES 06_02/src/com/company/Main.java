/*
 * SUMMARY: Exercises 06_02; Implement the following UML chart.
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Main {

    public static void main(String[] args) {
	ResizableCircle resizableCircle=new ResizableCircle(100.0);
	System.out.println(resizableCircle);
    resizableCircle.resize(250);
    System.out.println(resizableCircle);
    }
}
