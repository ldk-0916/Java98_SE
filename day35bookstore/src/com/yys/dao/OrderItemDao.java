package com.yys.dao;

import com.yys.pojo.OrderItem;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/13:51
 */
public interface OrderItemDao {
    //保存订单项
    int saveOrderItem(OrderItem orderItem);
}
