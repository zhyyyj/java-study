package com.yjzh.java.week4;


/**
 * @ClassName OtherEmployee
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/26
 **/
public class OtherEmployee extends BaseEmployee{
    private  String gender;

    public  OtherEmployee(String gender){
        this.gender = gender;
    }

    public OtherEmployee(){

    }


    @Override
    public int getSalary() {
        return 0;
    }
}
