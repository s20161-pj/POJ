/*
 * SUMMARY: EXERCISES 26; As in previous we want to print out the words in a file, but for this program we also want to print out their count, in ascending order of occurrence. Thus, for the input file
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class DifferentWords {
    public static void main(String[] args) {

        int wartosc = 0;
        FileReader fr = null;
        Set<String> set = new HashSet();

        //OTWIERANIE PLIKU:
        try {
            fr = new FileReader("plik.txt");
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        StreamTokenizer st = new StreamTokenizer(fr);
        //ODCZYT KOLEJNYCH "TOKENÓW" Z PLIKU:
        try {
            while ((wartosc = st.nextToken()) != StreamTokenizer.TT_EOF) {
                if (wartosc == StreamTokenizer.TT_WORD)
                    set.add(st.sval.replaceAll("[,.]", "").toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }

        //ZAMYKANIE PLIKU:
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
        }
        for (String slowo : set) {
            System.out.print(slowo + " ");
        }
        System.out.println("\nLiczba słów: " + set.size());
    }
}
