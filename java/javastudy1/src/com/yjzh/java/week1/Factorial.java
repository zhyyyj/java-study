package com.yjzh.java.week1;

/**
 * @ClassName Factorial
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        //定义一个整型变量
        int n = 5;
        int result = 1;
        for(int i = 1; i <= n; i++){
            result=result * i;
        }
        System.out.printf(n+"的阶乘是：" +result);
    }
}
