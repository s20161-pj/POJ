/*
 * SUMMARY: Exercises 07_02
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class User {
    private String name;
    private String surname;
    private String login;
    private String mail;
    private int trustPoints; //punty zaifania

    public User(String name,String surname, String login, String mail, int trustPoints){
        this.name=name;
        this.surname=surname;
        this.login=login;
        this.mail=mail;
        this.trustPoints=trustPoints;
    }

    public String getName() {
        return this.name;
    }
    public String getLogin() {
        return this.login;
    }
    public void addTrustPoints() {
        this.trustPoints = ++this.trustPoints;
    }

    public void removeTrustPoints() {
        this.trustPoints = --this.trustPoints;
    }
}
