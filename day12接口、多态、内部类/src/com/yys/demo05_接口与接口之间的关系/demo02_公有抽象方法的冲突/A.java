package com.yys.demo05_接口与接口之间的关系.demo02_公有抽象方法的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/13:58
 */
public interface A {
    public abstract void method();
}
 interface B {
    public abstract void method();
}
interface C extends A,B{
}

class Imp implements C{

    @Override
    public void method() {
        System.out.println("实现接口的抽象方法");
    }
}
class Test{
    public static void main(String[] args) {
        /*
            公有抽象方法的冲突:子接口只会继承一个有冲突的抽象方法;
         */
        Imp imp = new Imp();
        imp.method();
    }
}
