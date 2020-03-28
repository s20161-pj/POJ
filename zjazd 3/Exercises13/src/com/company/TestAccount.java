/*
 * SUMMARY: "Exercise 13;Implement the following UML chart."
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class TestAccount {

    public static void main(String[] args) {
	Account account=new Account("1", "Joanna");
    System.out.println(account.toString());

    account.credit(1000);
    System.out.println(account.toString());
    account.debit(500);
    System.out.println(account.toString());
    Account account2=new Account("2","Maria");
    account.transferTo(account2, 100);
    System.out.println(account.toString());
    System.out.println(account2.toString());
    account2.debit(300);

    }
}
