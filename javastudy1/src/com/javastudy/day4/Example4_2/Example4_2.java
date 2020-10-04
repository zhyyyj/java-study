package com.company.JavaStudy.day04.Example4_2;

public class Example4_2 {
    public static void main(String[] args) {
        XiyoujiRenwu zhubajie=null,sunwukong=null;
        zhubajie =new XiyoujiRenwu();
        sunwukong =new XiyoujiRenwu();
        zhubajie.name=PersonName.八戒;
        zhubajie.height=1.83f;
        zhubajie.weight=86f;
        zhubajie.head="猪头";
        zhubajie.name=PersonName.悟空;
        zhubajie.height=1.66f;
        zhubajie.weight=1006f;
        zhubajie.head="猴头";
        System.out.println(zhubajie.name+"的身高:"+zhubajie.height);
        System.out.println(zhubajie.name+"的体重："+zhubajie.weight);
        System.out.println(zhubajie.name+"的头："+zhubajie.head);
        System.out.println(sunwukong.name+"的身高:"+sunwukong.height);
        System.out.println(sunwukong.name+"的体重："+sunwukong.weight);
        System.out.println(sunwukong.name+"的头："+sunwukong.head);
        zhubajie.speak(zhubajie.name+"现在我想娶媳妇");
        System.out.println(zhubajie.name+"我现在的头"+zhubajie.head);
        sunwukong.speak(sunwukong.name+"我重"+sunwukong.weight+"公斤，想骗八戒背我");
        System.out.println(sunwukong.name+"现在的头："+sunwukong.head);

    }
}
