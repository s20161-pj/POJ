/*
 * SUMMARY: Exercises 05_01; Implement the following UML chart
 * Write a program that allocates 10 points in an array of MyPoint, and
 * initializes to (1, 1), (2, 2), ... (10, 10).
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	MyPoint[] tablica_punktow=new MyPoint[10];
	for(int i=0;i<10;i++)
    {
        tablica_punktow[i]=new MyPoint(i+1, i+1);
    }
	for(int i=0;i<10;i++)
    {
        System.out.println (tablica_punktow[i].toString());
    }
    }
}
