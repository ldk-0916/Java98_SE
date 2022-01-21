package com.yys.demo06方法重写的使用场景;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/14:29
 */
public class Zi extends Fu {
    @Override
    public void sport(){
        System.out.println("Zi 运动方式游泳");
    }

    //子类方法的实现要保留父类方法的功能,可以在其基础上增加功能
    @Override
    public void run(){
        //让父类的方法执行---->复制父类的代码
        super.run();//调用父类的方法

        //增加额外的代码
        System.out.println("Fu 跑第4圈");
        System.out.println("Fu 跑第5圈");
        System.out.println("Fu 跑第6圈");
        System.out.println("Fu 跑第7圈");
        System.out.println("Fu 跑第8圈");
    }
}
