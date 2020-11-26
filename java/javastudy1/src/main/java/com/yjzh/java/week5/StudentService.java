package com.yjzh.java.week5;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/11/2
 **/
public interface StudentService {
    boolean checkHealth(Student student) throws TooWeightException;
}
