package com.yjzh.java.week1.day1;

public class Rect {
    double width;
    double height;
    double getArea(){//返回长方形面积
        return width*height;
    }
}
class Examplel_2{
    public static void main(String[] args) {
        Rect rectangle;
        rectangle = new Rect();
        rectangle.width = 1.819;
        rectangle.height = 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积："+area);
    }
}
