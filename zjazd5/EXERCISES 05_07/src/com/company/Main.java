/*
 * SUMMARY: Exercises 05_07; Write a program called GradesStatistics, which reads in n grades (of int between 0 and
 * 100, inclusive) and displays the average, minimum, maximum, median and standard
 * deviation. Display the floating-point values up-to 2 decimal places.
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        DecimalFormat mf = new DecimalFormat("0.00");
        int n;
        do {
            System.out.print("Enter the number of students: ");
            n = wejscie.nextInt();
        }while(n < 0);
        List<Integer> grades = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int grade;
            do {
                System.out.print("Enter grade for student " + (i+1) + ": ");
                grade = wejscie.nextInt();
            }while(grade < 0 || grade > 100);
            grades.add(grade);
        }

        System.out.print("The grades are: [");
        int index = 0;
        double suma = 0;
        for(Integer element : grades){
            suma += element;
            System.out.print(element);
            index++;
            if(index != grades.size()){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        double average = Math.round((suma/grades.size())*100.0)/100.0;
        System.out.println("The average is: " + mf.format(average));
        Collections.sort(grades);
        int middle;
        double median;
        middle=(grades.size()+1)/2;
        if(grades.size()%2==0){
            median=grades.get(middle-1)+grades.get(middle);
            median=Math.round(median/2.0*100.0)/100.0;
        }
        else
        {
            median=Math.round(grades.get(middle-1)*100.0)/100.0;
        }
        System.out.println("The median is: " + mf.format(median));
        System.out.println("The minimum is: " + grades.get(0));
        System.out.println("The maximum is: " + grades.get(grades.size()-1));

        double stddev = 0;
        for(Integer element : grades){
            stddev += (element - average)*(element-average);
        }
        stddev = stddev/grades.size();
        stddev = Math.round(Math.sqrt(stddev)*100.0)/100.0;
        System.out.println("The standard deviation is: " + mf.format(stddev));
    }
}
