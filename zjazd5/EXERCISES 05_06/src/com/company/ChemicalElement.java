/*
 * SUMMARY: Exercises 05_06; Chemical elements
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;
import java.util.Scanner;
import java.io.File;

public class ChemicalElement {
    private String name;
    private String symbol;
    private int atomicNumber;
    public ChemicalElement(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    public String getType() {
        int alkaliMetal[] = {3, 11, 19, 37, 55, 87};
        int metal[] = {13, 49, 50, 81, 82, 83, 113, 114, 115};
        for (int element : alkaliMetal) {
            if (element == this.atomicNumber)
                return "Alkali metal";
        }

        for (int element : metal) {
            if (element == this.atomicNumber)
                return "Metal";
        }
        if ((this.atomicNumber >= 21 && this.atomicNumber <= 31)
                || (this.atomicNumber >= 39 && this.atomicNumber <= 48)
                || (this.atomicNumber >= 72 && this.atomicNumber <= 80)
                || (this.atomicNumber >= 104 && this.atomicNumber <= 112)) {
            return "Transition metal";
        }
        return "Unknown";
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    public String toString() {
        return "Chemical Element: " + this.getName() + " [" + this.getSymbol() + "], Atomic Number: " + this.getAtomicNumber() + ", Type: " + this.getType() + "]";

    }

}