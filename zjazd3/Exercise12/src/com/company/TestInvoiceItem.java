/*
 * SUMMARY: "Exercise 12;Implement the following UML chart. Create test class for each UML diagarm"
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class TestInvoiceItem {

    public static void main(String[] args) {

        InvoiceItem invoiceItem = new InvoiceItem("1", "komputery", 4, 2350.60);
        System.out.println(invoiceItem.toString());
    }
}
