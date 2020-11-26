package com.yjzh.java.week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(8);
        map.put("apple",12);
        map.put("pear", 8);
        map.put("banana", 24);
        //通过for遍历
        for (String key:map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "单价为：" + value);
        }
        //通过Iterator遍历
        System.out.println("通过Iterator遍历");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());

        }

        System.out.println("通过遍历Map的values，只能遍历value，获取不到key");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("通过遍历Map的entrySet,遍历Key和Value");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "单价为：" + entry.getValue());
        }
        System.out.println("Lambda表达遍历");
        map.forEach((key , value)-> System.out.println("key:" + key+"Value" + value));
        //编写国家和首都的关系
        Map<String, String> countryMap = new HashMap<>(8);
        countryMap.put("China","BeiJing");
        countryMap.put("Britain","London");
        countryMap.put("America","Washington");
        //通过for遍历
        for (String countryKey:countryMap.keySet()) {
            String countryValue = countryMap.get(countryKey);
            System.out.println(countryKey + "的首都为：" + countryValue);
        }
    }
}
