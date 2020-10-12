package com.yjzh.java.week2;

/**
 * @ClassName Student
 * @Description TODO
 * @Author WL
 * @Date 2020/10/12
 **/
public class Student {
    private String studentName;
    private Phone phone;

    public Student(String studentName, Phone phone, Book[] books) {
        this.studentName = studentName;
        this.phone = phone;
        this.books = books;
    }
    public Student(){

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    private Book[] books;
}
