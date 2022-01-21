package com.yys.test;

import com.yys.dao.OrderDao;
import com.yys.dao.impl.OrderDaoImpl;
import com.yys.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/04/13:36
 */
public class OrderDaoTest {
    @Test
    public void saveOrder(){
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(new Order("123456",new Date(),new BigDecimal(100),0,1));
    }
}
