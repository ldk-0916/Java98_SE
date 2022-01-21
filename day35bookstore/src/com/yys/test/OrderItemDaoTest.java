package com.yys.test;

import com.yys.dao.OrderItemDao;
import com.yys.dao.impl.OrderItemDaoImpl;
import com.yys.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/14:00
 */
public class OrderItemDaoTest {
    @Test
    public void saveOrderItem(){
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null,"java死亡编程",1,new BigDecimal(100),new BigDecimal(100),"123456"));
    }
}
