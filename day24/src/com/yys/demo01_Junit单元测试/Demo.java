package com.yys.demo01_Junit单元测试;

import org.junit.Test;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:07
 */
public class Demo {

    /*
        Junit单元测试注意的事项
            1.测试方法的权限修饰符类型必须是public
            2.测试方法一定是没有参数的
            3.测试方法的返回值类型一定是void
            4.一测试方法的声明上一定要使用@Test注解
     */
    @Test
    public void show(){
        System.out.println("Hello World!");
    }

    //报错:Method method() should be public
    /*@Test
    private void method(){
        System.out.println("你好");
    }*/

    /*@Test错误Method play should have no parameters
    public void play(int s){
        System.out.println("打球...");
    }*/

    /*@Test 错误:Method num() should be void
    public int num(){
        return 1;
    }*/
}
