package com.yys.demo18引用类型使用小结.demo03接口作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:28
 */
public interface A {
    void show();
}
class Imp implements A{

    @Override
    public void show() {
        System.out.println("实现类展示...");
    }
}
