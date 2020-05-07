/*
 * SUMMARY: Exercises 05_05; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        Customer kaziu = new Customer(2, "Kazimierz", 40);
        Customer asia = new Customer( 1, "Joanna", 20);

        Invoice invoice = new Invoice(1, kaziu, 1000);
        System.out.println(invoice.toString());
        System.out.println("Faktura zostala wystawiona na zlego klienta, zmieniamy klienta faktur na Asię");
        invoice.setCustomer(asia);
        System.out.println(invoice.toString());
    }
}