package com.yjzh.java.week5.book;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName BookMapper
 * @Description TODO
 * @Author zhyyyj
 * @Date 11/2/2020
 **/
public class BookMapper {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("JAVA", new BigDecimal("20"), "3214567899875"),
                new Book("JAVA2", new BigDecimal("998"), "5214567899875"),
                new Book("Java程序设计", new BigDecimal("60"), "1214447899875")};
        IBookService bookService = new BookService();

        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            try {
                bookService.isPutOnTheShelf(book);
            } catch (ExpensiveBookException | IllegalBookNameException | NonStandardISBNException e) {
                System.err.print(e.showMsg());
                continue;
            }
            list.add(book);
        }

        System.out.println("结果为:"+ Arrays.toString(list.toArray(new Book[0])));
    }
}
