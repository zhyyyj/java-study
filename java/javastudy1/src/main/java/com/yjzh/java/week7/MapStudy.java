package com.yjzh.java.week7;

import java.util.*;



/**
 * @ClassName MapStudy
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/16
 **/
public class MapStudy {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);

        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "CoreJava");
        map.put("Allen", "JDBC");

        //for循环遍历
        for (String key : map.keySet()) {
            String course = map.get(key);
            System.out.println(key + "任教:" + course);
        }

        System.out.println("通过遍历Map的 entrySet，遍历 Key和Value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "任教:" + entry.getValue());
        }

        System.out.println("输出所有教JDBC的讲师");
        for (String key : map.keySet()) {
            String course = map.get(key);
            if (course.equals("JDBC")) {
                System.out.println(key + "任教:" + course);
            }
        }
    }
}