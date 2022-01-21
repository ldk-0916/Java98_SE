package com.yys.demo17_内部类.demo01_成员内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/15:11
 */
//外部类
public class Body {
    //成员变量
    private int numW = 20;

    //成员方法
    public void methodW1(){
        System.out.println("外部类的成员方法1");
        Body.Heart bh = new Body().new Heart();//也可以
        //访问内部类成员
        Heart ht = new Heart();
        System.out.println(ht.numN);//10
        ht.methodN1();

    }
    private void methodW2(){
        System.out.println("外部类的成员方法2");
    }

    /**
     * 内部类
     */
    public class Heart{
        //成员变量
        int numN = 10;
        //成员方法
        public void methodN1(){
            System.out.println("成员内部类1号");
            //访问外部类
            System.out.println(numW);
            methodW2();

        }
        public void methodN2(){
            System.out.println("内部成员类2号");
        }
    }

}
