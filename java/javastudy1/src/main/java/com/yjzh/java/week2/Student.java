package com.yjzh.java.week2;
import lombok.*;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private  String studentName;
    private  String gender;
    private Phone phone;
    private List<Book> bookList;
}
