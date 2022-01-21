package com.yys.web;

import com.yys.pojo.Book;
import com.yys.pojo.Page;
import com.yys.service.BookService;
import com.yys.service.impl.BookServicImpl;
import com.yys.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/15:14
 */

@WebServlet("/book")
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookServicImpl();

    /**
     * 处理分页功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数pageNo,pageSize
        int pageNo = WebUtils.parseInt(request.getParameter("pageNo"), 1);
        System.out.println(pageNo);
        int pageSize = WebUtils.parseInt(request.getParameter("pageSize"), Page.PAGE_SIZE);
        //调用service层
        Page<Book> page = bookService.page(pageNo, pageSize);
        page.setUrl("/book?action=page");
        //3.存到作用域
        request.setAttribute("page",page);
        //转发
        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request,response);
    }

    /**
     * 添加
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int pageNo = WebUtils.parseInt(request.getParameter("pageNo"), 0);
        pageNo +=1;
        //1.获取请求参数,封装成book对象
        Map<String, String[]> map = request.getParameterMap();
        System.out.println(map);
        Book book = WebUtils.saveParamToBean(map, new Book());
        //2.处理业务
        bookService.addBook(book);
        System.out.println(book);
        response.sendRedirect(request.getContextPath()+"/book?action=page&pageNo=" + pageNo);
    }
    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //1.获取id
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        bookService.deleteBookById(id);
        //重定向到图书列表管理页面
        response.sendRedirect(request.getContextPath()+"/book?action=page&pageNo=" + request.getParameter("pageNo"));
    }

    /**
     * 修改
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数,封装成book对象
        Book book = WebUtils.saveParamToBean(request.getParameterMap(), new Book());
        //调用Service层修改图书
        bookService.updateBook(book);
        response.sendRedirect(request.getContextPath()+"/book?action=page&pageNo=" + request.getParameter("pageNo"));
    }

    protected void queryBookById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = WebUtils.parseInt(request.getParameter("id"), 0);
        //调用Service层查询图书
        Book book = bookService.queryBookById(id);
        //保存图书到作用域中
        request.setAttribute("book",book);
        request.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(request,response);
    }

    /**
     * 查询所有
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void queryAllBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过bookService查询全部图书
        List<Book> books = bookService.queryBooks();
        //存储到作用域
        request.setAttribute("books",books);
        //请求转发
        request.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(request,response);
    }



}
