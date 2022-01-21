package com.yys.web;

import com.yys.pojo.Cart;
import com.yys.pojo.User;
import com.yys.service.OrderService;
import com.yys.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/15:13
 */
@WebServlet("/orderServlet")
public class OrderServlet extends BaseServlet {
    private OrderService orderService = new OrderServiceImpl();

    /**
     * 生成订单
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void createOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取购物车对象
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        //获取userId
        User loginUser = (User) request.getSession().getAttribute("user");
        if (loginUser == null){
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
            return;
        }
        Integer userId = loginUser.getId();
        //调用service层方法,生成订单
        String orderId = orderService.createOrder(cart, userId);
        request.getSession().setAttribute("orderId",orderId);
        response.sendRedirect(request.getContextPath()+"/pages/cart/checkout.jsp");
    }
}
