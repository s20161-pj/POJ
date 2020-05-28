package com.company;

public class Leaf implements  Turner {
    @Override
    public void turn() {
        System.out.println("Changing colors");
    }
}
