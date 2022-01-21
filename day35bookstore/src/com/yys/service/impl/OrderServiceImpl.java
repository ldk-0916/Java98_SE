package com.yys.service.impl;

import com.yys.dao.OrderDao;
import com.yys.dao.OrderItemDao;
import com.yys.dao.impl.OrderDaoImpl;
import com.yys.dao.impl.OrderItemDaoImpl;
import com.yys.pojo.Cart;
import com.yys.pojo.CartItem;
import com.yys.pojo.Order;
import com.yys.pojo.OrderItem;
import com.yys.service.OrderService;

import java.util.Date;
import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/14:12
 */
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao = new OrderDaoImpl();
    private OrderItemDao orderItemDao = new OrderItemDaoImpl();
    @Override
    public String createOrder(Cart cart, Integer userId) {
        //订单号==唯一
        String orderId = System.currentTimeMillis() +""+ userId;
        //创建一个订单对象
        Order order = new Order(orderId,new Date(),cart.getTotalPrice(),0,userId);
        //保存订单
        orderDao.saveOrder(order);
        //遍历购物车中的每一个商品项转换成订单项,存到数据库
        for (Map.Entry<Integer, CartItem> entry:cart.getItems().entrySet()) {
            //获取每一个购物车的商品项
            CartItem cartItem = entry.getValue();
            //转换成订单项
            OrderItem orderItem = new OrderItem(null,cartItem.getName(),cartItem.getCount(),cartItem.getPrice(),cartItem.getTotalPrice(),orderId);

            //保存到数据库
            orderItemDao.saveOrderItem(orderItem);
        }
        //清空购物车
        cart.clear();

        return orderId;
    }
}

