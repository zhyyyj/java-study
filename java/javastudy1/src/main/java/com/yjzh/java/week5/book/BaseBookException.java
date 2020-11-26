package com.yjzh.java.week5.book;

/**
 * @ClassName BaseBookException
 * @Description TODO
 * @Author zhyyyj
 * @Date 11/2/2020
 **/
public class BaseBookException extends Exception {
    protected String msg;

    public BaseBookException(String msg){
        this.msg = msg;
    }

    public String showMsg(){
        return this.msg;
    }
}
