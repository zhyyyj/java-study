package com.yjzh.java.week1.day4.Example4_4;

public class Rect {
    double width, height, area;

    void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    double getArea() {
        area = width * height;
        return area;
    }
}
