package com.yjzh.java.week5;

/**
 * @ClassName Student
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/2
 **/
public class Student {
    private String name;
    private Integer weight;

    public Student(String name, Integer weight){
        this.name =name;
        this.weight = weight;
    }
    public Student(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getWeight(){
        return weight;
    }
}
