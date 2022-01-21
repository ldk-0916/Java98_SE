package com.yys.dao.impl;

import com.yys.dao.BaseDao;
import com.yys.dao.OrderItemDao;
import com.yys.pojo.OrderItem;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/13:55
 */
public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into t_order_item(name,count,price,total_price,order_id) values(?,?,?,?,?)";
        return update(sql,orderItem.getName(),orderItem.getCount(),orderItem.getPrice(),orderItem.getTotalPrice(),orderItem.getOrderId());
    }
}
