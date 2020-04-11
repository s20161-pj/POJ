/*
 * SUMMARY: Exercises 20; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Joanna", "Gdynia");
        Student student = new Student("Joanna", "Gdynia", "informatyka", 1, 3245.21);
        Staff staff = new Staff("Joanna", "Gdynia", "pjwstk", 4563.21);
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());
    }
}
