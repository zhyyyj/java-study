package com.yjzh.java.week1.day4.Example4_5;

public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }
}
