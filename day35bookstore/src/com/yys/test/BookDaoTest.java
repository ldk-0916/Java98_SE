package com.yys.test;

import com.yys.dao.BookDao;
import com.yys.dao.impl.BookDaoImpl;
import com.yys.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/14:25
 */
public class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();
    @Test
    public void addBook(){
        bookDao.addBook(new Book(null,"打工是不可能打工的",new BigDecimal(1000),"周某",10000,0,null));

    }

    @Test
    public void queryBooks(){
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void deleteBookById() {
        System.out.println(bookDao.deleteBookById(43));
    }

    @Test
   public void updateBook() {
        bookDao.updateBook(new Book(1,"大大大神",new BigDecimal(999),"大神",11,1,null));
    }

    @Test
   public void queryBookById() {
        System.out.println(bookDao.queryBookById(42));
    }


    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        System.out.println(bookDao.queryForPageItems(1,5));
    }
}
