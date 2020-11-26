package com.yjzh.java.week7;

import java.util.*;


/**
 * @ClassName SetTest
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("B");
        set.add("A");
        set.add("C");

        System.out.println("使用for循环遍历");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("使用lambda遍历");
        set.forEach(s -> System.out.println(s));

        set.forEach(System.out::println);




    }
}
