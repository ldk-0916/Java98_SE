package com.yys.dao;

import com.yys.pojo.Book;

import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/14:09
 */
public interface BookDao {

    /**
     * 增加图书
     * @param book
     * @return
     */
     int addBook(Book book);

    /**
     * 删除图书(通过id(图书编号)删除)
     * @return
     */
     int deleteBookById(Integer id);

    /**
     * 修改图书...
     * @param book
     * @return
     */
     int updateBook(Book book);

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

    /**
     * 查询总记录条数
     * @return
     */
     Integer queryForPageTotalCount();

    /**
     * 查询当前页面数据
     * @return
     */
    List<Book> queryForPageItems(int begin,int pageSize);

    Integer queryForPageTotalCountByPrice(int min, int max);
    List<Book> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
