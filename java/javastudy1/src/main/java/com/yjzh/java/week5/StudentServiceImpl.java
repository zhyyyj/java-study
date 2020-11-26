package com.yjzh.java.week5;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/2
 **/
public class StudentServiceImpl implements StudentService{

  /**
    * @param student
    **/


    public boolean checkHealth(Student student) throws TooWeightException{
        boolean flag = false;
        if(student.getWeight() > 100){
            throw new TooWeightException("体重超标");
        }else {
            flag = true;
        }
        return flag;
    }
}
