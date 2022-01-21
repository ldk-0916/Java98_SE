package com.yys.demo10多态的形式.demo03_父接口多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/10:01
 */
public interface Fu {
    public static final int NUM1 = 100;
    public abstract void method();
}
class ZiImp implements Fu{

    @Override
    public void method() {
        System.out.println("重写method方法...");
    }
}

class Test{
    public static void main(String[] args) {
        //父接口多态
        //接口引用指向实现类对象
        Fu f = new ZiImp();
        System.out.println(f.NUM1);
        f.method();
    }
}
