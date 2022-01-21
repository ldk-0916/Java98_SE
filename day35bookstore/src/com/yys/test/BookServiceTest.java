package com.yys.test;

import com.yys.pojo.Book;
import com.yys.pojo.Page;
import com.yys.service.BookService;
import com.yys.service.impl.BookServicImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/15:09
 */
public class BookServiceTest {
    private BookService bookService = new BookServicImpl();
    @Test
    public void addBook(){
        bookService.addBook(new Book(null,"笑傲江湖",new BigDecimal(9999),"金庸",10000,0,null));
    }

    @Test
    public void queryBooks(){
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }
    @Test
    public void deleteBookById(){
        bookService.deleteBookById(44);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(1,"大大大神",new BigDecimal(999),"大神呀",11,1,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(42));
    }

    @Test
    public void page() {
        System.out.println(bookService.page(2, Page.PAGE_SIZE));
    }
}
