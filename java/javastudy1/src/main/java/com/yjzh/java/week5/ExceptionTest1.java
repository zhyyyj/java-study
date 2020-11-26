package com.yjzh.java.week5;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @ClassName ExceptionTest1
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
/*        int result = 3 / 0;
        System.out.println(result);*/
        /*int[] a = new int[]{1,2,3,4,5};
        try {

        System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("数组索引越界");
            System.err.println("引起的原因" + e.getCause());
            System.err.println1("异常的详细信息" + e.getMessage());
            System.err.println("数组索引越界" + e.toString());
            }*/
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //从键盘输入一串字符串
        String priceStr = scanner.nextLine();
        //将字符串转化为整型123

        int price = Integer.parseInt(priceStr);

        System.out.println("price = " + price);




    }
}
