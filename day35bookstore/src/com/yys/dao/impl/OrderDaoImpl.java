package com.yys.dao.impl;

import com.yys.dao.BaseDao;
import com.yys.dao.OrderDao;
import com.yys.pojo.Order;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/11:23
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(order_id,create_time,price,status,user_id) values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }
}
