/*
 * SUMMARY: "Exercise 14;Implement the following UML chart. Create test class for each UML diagarm"
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Date {
    private int day;
    private int month;
    private int year;
    private void validateday(int day) {             
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Błędny dzień");
        }
    }
    private void validatemonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Blędny miesiąc");
        }
    }
    private void validateyear ( int year){
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Błędny rok");
        }
    }
public Date (int day, int month, int year){
this.validateday(day);
this.validatemonth(month);
this.validateyear(year);
}
public int getDate()
{
    return this.day;
}
public int getMonth()
{
    return this.month;
}
public int getYear()
{
    return year;
}
void setDay(int day){
        this.validateday(day);
}
void setMonth(int month){
        this.validatemonth(month);
}
void setYear(int year){
        this.validateyear(year);
}
void setDate(int day, int month, int year){
        this.validateday(day);
        this.validatemonth(month);
        this.validateyear(year);
}
public String toString()
    {
        return "dd/mm/yyyy: "+String.format("%02d", this.day)+"/"+String.format("%02d", this.month)+"/"+this.year+" ";
    }
}

