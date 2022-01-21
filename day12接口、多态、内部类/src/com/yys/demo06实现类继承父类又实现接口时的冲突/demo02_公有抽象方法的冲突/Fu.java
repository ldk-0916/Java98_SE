package com.yys.demo06实现类继承父类又实现接口时的冲突.demo02_公有抽象方法的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/15:04
 */
public abstract class Fu {
    public abstract void method();
}
interface A{
    public abstract void method();
}
class Zi extends Fu implements A{

    @Override
    public void method() {
        System.out.println("Zi类重写有冲突的抽象方法");
    }
}
class Test{
    public static void main(String[] args) {
        /*
            公有抽象方法的冲突:子类必须重写一次有冲突的抽象方法
         */
        Zi zi = new Zi();
        zi.method();
    }
}
