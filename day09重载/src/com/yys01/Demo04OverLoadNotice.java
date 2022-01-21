package com.yys01;

/**
 方法重载与哪些因素无关?
     1.与参数的名称无关
     2.与返回值类型无关
     3.与修饰符无关
 */
public class Demo04OverLoadNotice {
    public static void main(String[] args) {

    }

    //1.只有一个int类型
    public static void method(int num){

    }
    //2.两个int 只有参数名成不同,无法构成重载
   /* public static void method(int d){

    }*/

   //1和3除了返回值类型,其他相同,无法构成重载,所以与返回值类型无关
/*    public static int method(int a){
        return a;
    }*/
    //方法4和1只有修饰符不同,无法构成重载;所以....
    /*void method(int b);*/
}
