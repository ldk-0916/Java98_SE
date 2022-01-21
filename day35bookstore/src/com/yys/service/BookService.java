package com.yys.service;

import com.yys.pojo.Book;
import com.yys.pojo.Page;

import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/15:03
 */
public interface BookService {
    /**
     * 增加图书
     * @param book
     * @return
     */
    void addBook(Book book);

    /**
     * 删除图书(通过id(图书编号)删除)
     * @return
     */
    void deleteBookById(Integer id);

    /**
     * 修改图书...
     * @param book
     * @return
     */
    void updateBook(Book book);

    /**
     * 查询一本图书
     * @param id
     * @return
     */
    Book queryBookById(Integer id);

    /**
     * 查找所有图书
     * @return
     */
    List<Book> queryBooks();

    Page<Book> page(int pageNo,int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);

}
