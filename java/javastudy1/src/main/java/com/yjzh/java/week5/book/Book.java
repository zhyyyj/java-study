package com.yjzh.java.week5.book;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Book
 * @Description TODO
 * @Author zhyyyj
 * @Date 11/2/2020
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private String name;
    private BigDecimal price;
    private String isbn;
}
