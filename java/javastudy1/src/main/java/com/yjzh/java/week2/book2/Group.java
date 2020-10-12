package com.yjzh.java.week2;

/**
 * @ClassName Group
 * @Description TODO
 * @Author WL
 * @Date 2020/10/12
 **/
public class Group {
    private String groupName;
    private Student[] students;

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
