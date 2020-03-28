/*
 * SUMMARY: "Exercise 15;Implement the following UML chart."
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    private void validatehour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Błędna godzina");
        }
    }

    private void validateminute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Błędnie podana minuta");
        }
    }

    private void validatesecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Błędnie podana sekunda");
        }
    }

    public Time(int hour, int minute, int second) {
        this.validatehour(hour);
        this.validateminute(minute);
        this.validatesecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    void setHour(int hour) {
        this.validatehour(hour);
    }

    void setMinute(int minute) {
        this.validateminute(minute);
    }

    void setSecond(int second) {
        this.validatesecond(second);
    }

    void setTime(int hour) {
        this.validatehour(hour);
    }

    public String toString() {
        return "hh:mm:ss " + String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " ";
    }

    public Time nextSecond() {
        int minute = getMinute();
        if (getSecond() == 59) {
            setSecond(0);
            setMinute(++minute);
        } else {
            int second = getSecond();
            setSecond(++second);
        }

        return this;
    }

    public Time previousSecond() {
        int minute = getMinute();
        if (getSecond() == 0) {
            setSecond(59);
            setMinute(--minute);
        } else {
            int second = getSecond();
            setSecond(--second);
        }
            return this;
    }
}


