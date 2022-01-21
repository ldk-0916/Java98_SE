package com.yys.demo18_代理模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:07
 */
public class Test {
    public static void main(String[] args) {
        /*
            代理模式的定义:
                一些人不愿意或者没有能力去完成某件事,那么就需要找个人代理自己完成这件事,这个人就是代理者
                包含三个角色:被代理者,代理者,抽象协议(抽象方法)
                协议:被代理者需要代理的方法,就定义在这里,然后让代理者和被代理者去实现
         */
        //创建被代理者对象...
        JinLian jl = new JinLian();
        /*
            不找代理,金莲直接找西门庆,
         */
        //创建代理者对象
        WangPo wp = new WangPo(jl);
        wp.happy();
    }
}
