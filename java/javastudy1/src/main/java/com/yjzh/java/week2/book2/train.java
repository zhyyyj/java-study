package com.yjzh.java.week2;

import java.util.Date;

/**
 * @ClassName train
 * @Description TODO
 * @Author WL
 * @Date 2020/10/12
 **/
public class train {
    public static void main(String[] args) {
        Book book1 = new Book("Java面向对象",120,new Date());
        Book book2 = new Book("Java宝典",100,new Date());
        Book book3 = new Book("Java练习",220,new Date());
        Book book4 = new Book("Java大神",120,new Date());
        Book book5 = new Book("Java",90,new Date());

        Phone phone1 = new Phone("iPonexs",9999);
        Phone phone2 = new Phone("iPonexr",8888);

        Student student1 = new Student("张三",phone1,new Book[]{
              book1,book2
        });
        Student student2 = new Student("李四",phone2,new Book[]{
                book1,book2,book3
        });
        Student student3 = new Student("王五",phone1,new Book[]{
                book1,book2,book3,book4,book5
        });

        Group group1 = new Group("第一组",new Student[] {
                student1,student2
        });
        Group group2 = new Group("第二组",new Student[] {
                student3
        });
        Student[] students = group1.getStudents();

        for (Student student : students){
            System.out.println(student.getStudentName());
        }
    }
}
