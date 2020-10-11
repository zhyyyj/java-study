package com.company.JavaStudy.day04.Example4_7;

public class Circle {
    double x,y,radius;
    public void setX(double a){
        x=a;
    }
    public double getX(){
        return  x;
    }

    public void setY(double b) {
        y=b;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        if(radius>0)
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
