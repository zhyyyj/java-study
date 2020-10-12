package com.yjzh.java.week2;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author WL
 * @Date 2020/10/12
 **/
public class Phone {
    private String phoneName;
    private Integer phonePrice;

    public Phone(String phoneName,Integer phonePrice){
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
    }
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Integer phonePrice) {
        this.phonePrice = phonePrice;
    }
}
