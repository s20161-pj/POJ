/*
 * SUMMARY:EXERCISES 24; Write class to check if a number is Armstrong number or not? (input 153 output true, 123 output false)
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int x = scan.nextInt();
        System.out.println("Wprowadzona przez Ciebie liczba to: " + x);

        Armstrong armstrong = new Armstrong(x);
        boolean result = armstrong.isValid();

        if (result == true) {
            System.out.println("Podana liczba to liczba Armstronga");
        } else {
            System.out.println("Podana liczba nie jest liczbą Armstronga");
        }
    }
}
