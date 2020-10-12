package com.company.JavaStudy.day04.Example4_7;

public class Geometry {
    Rectangle rect;
    Circle circle;
    Geometry(Rectangle rect,Circle circle){
        this.circle=circle;
        this.rect=rect;
    }
    public void setCirclePosition(double x,double y){
        circle.setX(x);
        circle.setY(y);
    }
    public  void setCircleRadius(double radius){
        circle.setRadius(radius);
    }
    public void setRectanglePosition(double x,double y){
        rect.setX(x);
        rect.setY(y);
    }
    public void setRectangleWithAndHeight(double w,double h){
        rect.setWidth(w);
        rect.setHeight(h);
    }
    public void showState(){
        double circleX=circle.getX();
        double rectX=rect.getX();
        if(rectX-rect.getWidth()>=circleX+circle.getRadius())
            System.out.println("矩形在圆的右侧");
        if (rectX+rect.getWidth()<=circleX-circle.getRadius())
            System.out.println("矩形在圆的左侧");
    }

}
