package com.yys.demo02实现接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/10:28
 */
public interface IA {
    void methodA();//抽象方法(省略写法)
}
interface IB{
    void methodB();
}

class Imp1 implements IA{
    @Override
    public void methodA() {

    }
}

class Imp2 implements IA,IB{

    @Override
    public void methodB() {
    }

    @Override
    public void methodA() {

    }
}

//继承的同时又实现接口
class Fu{}
class Imp3 extends Fu implements IA,IB{

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}


class Test{
    public static void main(String[] args) {
        /*
            实现接口:
                概述:类与接口之间的关系叫做实现关系,实现接口就类似于继承
                格式:
                    1.实现类可以实现一个接口,也可以实现多个接口
                    public class 实现类 implements 接口名1,接口名2..{} 注意:实现多个接口,接口之间逗号隔开
                注意:类实现接口后,必须重写所有的从抽象方法,否则该类必须是一个抽象类
                    2.实现类继承的同时,又实现接口
                    规则:先继承后实现
                    public class 实现类 extends 父类名 implements 接口名 接口名1,接口名2..{

                    }
         */
    }
}