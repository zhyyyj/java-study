package com.yjzh.java.week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        //创建一个List接口的实现类对象，泛型为Sring
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("JAVA");
        list.add("JavaScript");
        list.add("java");
        //随机取出List中的某个元素



        //用for循环遍历
        System.out.println("用for循环遍历List");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("用Iterator迭译器遍历list");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //用lambda表达式遍历list
        System.out.println("用lambad表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用lambda的方法应用来遍历list");
        list.forEach(System.out::println);


    }
}
