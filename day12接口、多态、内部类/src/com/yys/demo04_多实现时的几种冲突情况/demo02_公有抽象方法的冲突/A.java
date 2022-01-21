package com.yys.demo04_多实现时的几种冲突情况.demo02_公有抽象方法的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/13:34
 */
public interface A {
    public abstract void method();
}
interface B{
    public abstract void  method();
}
class Imp implements A,B{
    @Override
    public void method() {
        System.out.println("实现类重写抽象方法..");
    }
}
class Test{
    /*
        公有抽象方法冲突:实现类只需要重写一个就行
     */
}
