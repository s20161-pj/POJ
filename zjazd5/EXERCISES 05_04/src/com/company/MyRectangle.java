/*
 * SUMMARY: Exercises 05_04; Design a MyRectangle class which is composed of two MyPoint instances as
 * its top-left and bottom-right corners. Draw the class diagrams, write the codes, and write the test drivers.
 * AUTHOR: "Joanna Walkiewicz"
 */

package com.company;

public class MyRectangle {
    private MyPoint tl;
    private MyPoint br;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.tl = new MyPoint(x1,y1);
        this.br = new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint tl, MyPoint br){
        this.tl=tl;
        this.br=br;
    }

    public String toString(){
        return "[MyRectangle[tl=" + this.tl.toString() + ",br=" + this.br.toString() + "]";
    }

    public double getPerimeter(){
        double side1 = this.tl.distance(this.tl.getX(),this.br.getY());
        double side2 = this.tl.distance(this.br.getX(),this.tl.getY());
        double perimeter = 2*side1 + 2*side2;
        return perimeter;
    }

    public double getArea(){
        double side1 = this.tl.distance(this.tl.getX(),this.br.getY());
        double side2 = this.tl.distance(this.br.getX(),this.tl.getY());
        double area = side1*side2;
        return area;
    }
}
