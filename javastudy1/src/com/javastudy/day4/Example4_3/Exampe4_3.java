package com.company.JavaStudy.day04.Example4_3;

public class Exampe4_3 {
    public static void main(String[] args) {
        Point p1,p2;
        p1=new Point();
        p2=new Point();
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        p1.setXY(111,222);
        p2.setXY(-100,-200);
        System.out.println("p1的x，y坐标:"+p1.x+","+p1.y);
        System.out.println("p2的x，y坐标:"+p2.x+","+p2.y);
        p1=p2;
        System.out.println("将p2的引用赋给p1后：" );
        System.out.println("p1的引用："+p1);
        System.out.println("p2的引用："+p2);
        System.out.println("p1的x，y坐标"+p1.x+"，"+p1.y);
        System.out.println("p2的x，y坐标"+p2.x+"，"+p2.y);
    }
}
class Point{
    int x,y;
    void setXY(int m,int n){
        x=m;
        y=n;
    }
}
