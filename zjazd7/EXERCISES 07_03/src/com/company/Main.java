/*
 * SUMMARY: Exercises 07_03
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Cache x = Cache.getInstance();
        x.GetDataFromCsv(); //from csv
        x.GetDataFromCsv(); // from cache
    }
}
