package com.yjzh.java.week5.book;

/**
 * @ClassName IBookService
 * @Description TODO
 * @Author zhyyyj
 * @Date 11/2/2020
 **/
public interface IBookService {
    boolean isPutOnTheShelf(Book book) throws NonStandardISBNException, ExpensiveBookException, IllegalBookNameException;
}
