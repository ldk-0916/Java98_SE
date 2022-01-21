package com.yys.demo17_内部类.demo03_接口匿名内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/16:23
 */
public interface A {
    public abstract void show();
}
class Imp implements A{
    @Override
    public void show() {
        System.out.println("实现类实现show方法");
    }
}
