/*
 * SUMMARY: Exercises 22; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Point{

    protected float x=0.0f;
    protected float y=0.0f;

    public Point(float x, float y){
    this.x=x;
    this.y=y;
}
    public Point(){

    };
    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
    this.x=x;
    this.y=y;
    }
    public float[] getXY(){
    return new float[]{this.getX(), this.getY()};
    }

    public String toString() {
        return "("+ this.x + ", " + this.y+")";
    }
}
