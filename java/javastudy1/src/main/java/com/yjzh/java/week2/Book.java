package com.yjzh.java.week2;
import java.util.Date;
import jdk.jfr.DataAmount;
import jdk.jfr.Name;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import lombok.*;
import lombok.NoArgsConstructor;


/**
 * @ClassName Book
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/12
 **/
@AllArgsConstructor


@Data
public class Book {
        private String name;
        private Integer price;
        private Date publishDate;
    }




