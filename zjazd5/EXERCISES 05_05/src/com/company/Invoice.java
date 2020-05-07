/*
 * SUMMARY: Exercises 05_05; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAmount() {
        return String.valueOf(this.amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - ((getCustomer().getDiscount() / 100.0) * this.amount);
    }

    public String toString() {
        return "Faktura: " + this.getID() + ", klient: " + this.customer.toString() + ", kwota: " + this.getAmount() + ", rabat: " + this.customer.getDiscount() + ", po rabacie: " + this.getAmountAfterDiscount();
    }
}