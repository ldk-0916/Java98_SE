package com.yys.dao;

import com.yys.pojo.Order;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/11:20
 */
public interface OrderDao {
    //保存订单
    int saveOrder(Order order);
}
