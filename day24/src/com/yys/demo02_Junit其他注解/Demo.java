package com.yys.demo02_Junit其他注解;

import org.junit.*;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:19
 */
public class Demo {
    /*
         * @Before：用来修饰方法，该方法会在每一个测试方法执行之前执行一次。
         * @After：用来修饰方法，该方法会在每一个测试方法执行之后执行一次。
         * @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前执行一次，而且只执行一次。
         * @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后执行一次，而且只执行一次。
     */

    @BeforeClass
    public static void beforeClass(){
        System.out.println("在所有的测试方法之前执行...");
    }

    @Before
    public void before(){
        System.out.println("在测试方法执行之前被执行...");
    }

    @Test
    public void show(){
        System.out.println("你好show啊....");
    }

    @After
    public void after(){
        System.out.println("在测试方法执行之后被执行...");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("在所有的测试方法执行之后被执行");
    }
}
