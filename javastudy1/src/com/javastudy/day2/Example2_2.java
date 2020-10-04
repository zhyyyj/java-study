package com.company.JavaStudy.day02;

public class Example2_2 {
    public static void main(String[] args) {
        byte b=22;//定义一个byte类型
        int n=129;//定义一个int类型
        float f=123456789.123456789f;//定义一个float类型
        double d=123456789.123456789;//定义一个double类型
        //输出
        System.out.println("b= "+b);
        System.out.println("n= "+n);
        System.out.println("f= "+f);
        System.out.println("d= "+d);
        b=(byte)n;              //导致精度缺失
        f=(float)d;             //导致精度缺失
        //输出
        System.out.println("b= "+b);
        System.out.println("f= "+f);
    }
}
