/*
 * SUMMARY: Exercises 05_06; Chemical elements
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<ChemicalElement> pierwiastki = new ArrayList<>();
        File plik = new File("C:/Users/Home/Desktop/studiaJava/POJ/POJ/zjazd5/EXERCISES 05_06/src/com/company/periodensystem.csv");
        try {
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                String[] pierwiastek = linia.split(",");
                pierwiastki.add(new ChemicalElement(pierwiastek[1], pierwiastek[2], Integer.parseInt(pierwiastek[0])));
            }
        } catch (FileNotFoundException e) {
            System.exit(1);
        }
        for (ChemicalElement element : pierwiastki) {
            System.out.println(element);
        }
    }
}
