/*
 * SUMMARY: Exercises 06_06;
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateLoans {

    public static void main(String[] args) {
        ArrayList<Loan> loans = new ArrayList<Loan>();
        System.out.println("Please provide current prime interest rate: ");
        Scanner scan = new Scanner(System.in);
        double prime_rate = scan.nextDouble();
        for (int i = 0; i < 5; i++) {
            int choice = 0;
            System.out.println("Select your Loan");
            Scanner menu = new Scanner(System.in);
            System.out.println("1.Personal");
            System.out.println("2.Business");
            while (choice != 1 && choice != 2) {
                System.out.println("Insert your choice(1 or 2): ");
                choice = menu.nextInt();
            }
            System.out.println("Please provide your last name: ");
            scan.nextLine();
            String last_name = scan.nextLine();
            System.out.println("Please provide your loan amount: ");
            double amount = scan.nextDouble();
            System.out.println("Please provide your loan term (1-short, 3-medium, 5-long): ");
            int loan_term = scan.nextInt();

            if (choice == 1) {
                PersonalLoan personalLoan = new PersonalLoan(("p" + i), last_name, amount, loan_term, prime_rate);
                loans.add(personalLoan);
            } else if (choice == 2) {
                BusinessLoan businessLoan = new BusinessLoan(("b" + i), last_name, amount, loan_term, prime_rate);
                loans.add(businessLoan);
            }

        }
        for (Loan element : loans) {
            System.out.println(element);
        }
    }
}
