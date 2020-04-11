/*
 * SUMMARY: EXERCISES 21; Implement the following UML chart
 * AUTHOR: "Joanna Walkiewicz"
 */
package com.company;

public class Point3D extends Point2D {
    protected float z = 0.0f; //pole

    public Point3D(float x, float y, float z) {      //konstruktor
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }
    public void setZ(float z){
    this.z=z;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(), this.getZ()};
    }

    @Override
    public String toString() {
         String s = "("+ this.x + ", " + this.y +", "+this.z+")";
         return s;
    }
}