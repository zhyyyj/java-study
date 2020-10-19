package com.yjzh.java.week3;

import com.yjzh.java.week1.day1.Circle.Circle;
import javafx.scene.shape.Cylinder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/19
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CircleApp {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        Circle circle = new Circle(10,20,5);
        Cylinder cylinder = new Cylinder(10,10,6,6);
        Point.
    }
}

