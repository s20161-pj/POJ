/*
 * SUMMARY: Exercises 07_03
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class NotValidDataStrategy implements Strategy {
    @Override
    public void handleException() {
        System.out.println("Nie można pobrać danych ponieważ plik zawiera niepoprawne dane");
    }
}
