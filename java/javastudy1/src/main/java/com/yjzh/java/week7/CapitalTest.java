package com.yjzh.java.week7;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Student
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/16
 **/
public class CapitalTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(8);
        map.put("中国","北京");
        map.put("美国","华盛顿");

        System.out.println("for");
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + "首都是：" +value);
        }


    }
}
