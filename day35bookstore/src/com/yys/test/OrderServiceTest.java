package com.yys.test;

import com.yys.pojo.Cart;
import com.yys.pojo.CartItem;
import com.yys.service.OrderService;
import com.yys.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/14:31
 */
public class OrderServiceTest {
    @Test
    public void createOrder(){
        OrderService orderService = new OrderServiceImpl();
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"开发与易经",1,new BigDecimal(1000),new BigDecimal(1000)));
        System.out.println("订单号是:"+orderService.createOrder(cart,1));
    }
}
