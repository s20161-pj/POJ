/*
 * SUMMARY:EXERCISES 24; Write class to check if a number is Armstrong number or not? (input 153 output true, 123 output false)
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {
    int number = 0;

    public Armstrong(int number) {
        this.number = number;
    }

    boolean isValid() {
        int x = this.number;
        List<Integer> lista = new ArrayList<>();
        while (this.number != 0) {
            int wynik = this.number % 10;
            lista.add(wynik);
            this.number = this.number / 10;
        }
        int suma = 0;
        int ilosc_cyfr = lista.size();
        for (int element : lista) {
            suma += Math.pow(element, ilosc_cyfr);
        }

        return suma == x;
    }

}
