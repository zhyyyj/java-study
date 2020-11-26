package com.yjzh.java.week4;


/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author 86180
 * @Date 2020/10/26
 **/
public class MarketEmployee extends BaseEmployee{
 private  String id;
 private static  final  String ADMIN = "admin";
 private  static  final  int HIGHER_SALARY = 3000;
 private  static  final  int LOWER_SALARY = 1000;
 public MarketEmployee (String id){
     this.id = id;
 }

    @Override
   public void print(){
        super.print();
        System.out.println("This is an abstract calss.");
    }
    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)){
            return HIGHER_SALARY;
        }else {
            return  LOWER_SALARY;
        }
    }
}
