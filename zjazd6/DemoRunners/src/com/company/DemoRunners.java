/*
 * SUMMARY: Exercises 06_04;
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class DemoRunners {

    public static void main(String[] args) {
        Machine machine = new Machine();
        Athlete athlete = new Athlete();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();
        machine.run();
        athlete.run();
        politicalCandidate.run();
    }
}
