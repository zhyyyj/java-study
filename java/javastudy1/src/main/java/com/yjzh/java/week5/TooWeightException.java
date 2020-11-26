package com.yjzh.java.week5;

/**
 * @ClassName TooWeightException
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/2
 **/
public class TooWeightException extends Exception {
    private String zhyyyj;

    public TooWeightException(){
        super();
    }

     public TooWeightException(String zhyyj){
        super();
        this.zhyyyj = zhyyyj;
     }

     public String showZhyyyj(){
        return this.zhyyyj;
     }
}
