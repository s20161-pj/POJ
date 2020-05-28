/*
 * SUMMARY: Exercises 06_06;
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class PersonalLoan extends Loan {
    public PersonalLoan(String loan_number, String last_name, double amount, int term, double prime_rate) {
        super(loan_number,last_name,amount,term);
        super.rate=prime_rate+2.0;
    }
}
