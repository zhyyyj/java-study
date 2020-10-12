package com.yjzh.java.week1.day4.Example4_5;

public class Circular {
    Circle bottom;
    double height;

    Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }

    double getVolme() {
        return bottom.getRadius();
    }
    double getBottomRadius() {
       return bottom.getRadius();
    }

    public void setBottomRadius(double r) {
        bottom.setRadius(r);
    }
}
