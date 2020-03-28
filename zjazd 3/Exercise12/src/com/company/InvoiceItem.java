/*
 * SUMMARY: "Exercise 12;Implement the following UML chart. Create test class for each UML diagarm"
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice)  //konstruktor
    {
        this.id = id;
        this.desc = desc;             //przypisanie wartości pól
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {       //met która nic nie zwraca, przyjmuje parametr int
        this.qty = qty;                 // przypisuje prywatnemu polu wartosc parametru qty
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    public String toString() {
        return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
    }
}
