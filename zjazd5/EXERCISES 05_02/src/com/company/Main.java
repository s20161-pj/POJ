/*
 * SUMMARY: Exercises 05_02; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        MyPoint[] tablicaPunktow = new MyPoint[10];
        for(int i=0; i<10; i++)
        {
            tablicaPunktow[i] = new MyPoint(i+1,i+1);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(tablicaPunktow[i].toString());
        }
        MyCircle kolo1 = new MyCircle(tablicaPunktow[5], 5);
        MyCircle kolo2 = new MyCircle(tablicaPunktow[7], 2);
        System.out.println(tablicaPunktow[5].distance(tablicaPunktow[7]));
        System.out.println(kolo1.distance(kolo2));
        System.out.println(kolo1.toString());
        System.out.println(kolo2.toString());
    }
}
