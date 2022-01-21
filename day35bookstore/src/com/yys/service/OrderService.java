package com.yys.service;

import com.yys.pojo.Cart;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/14:08
 */
public interface OrderService {
    //生成订单号
    String createOrder(Cart cart,Integer userId);
}
