/*
 * SUMMARY: Exercises 06_06;
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public abstract class Loan implements LoanConstants {
    protected String loan_number;
    protected String last_name;
    protected double amount;
    protected double rate = 0;
    protected int term;

    public Loan(String loan_number, String last_name, double amount, int term) {
        this.loan_number = loan_number;
        this.last_name = last_name;
        if (amount > 100000.0) {
            this.amount = 100000.0;
        } else {
            this.amount = amount;
        }
        if (term != this.short_term && term != this.medium_term && term != this.long_term) {
            this.term = this.short_term;
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        return "Loan="+this.loan_number+", Last name="+this.last_name+", Amount="+this.amount+", Term="+this.term+", Rate="+this.rate;
    }
}
