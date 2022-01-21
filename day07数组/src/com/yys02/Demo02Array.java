package com.yys02;

/**
 两个数组内存图(每个数组都有自己独立的内存空间,互不影响,互不干扰)

 注意:
 1.数组名称保存数组在堆内存中的地址值
 2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

 比如:你有两套房子,一套在吴中(钥匙是one),一套在相城(钥匙是two)
 one: 你自己拿着  打开的是吴中的房子
 two: 你对象拿着  打开的是相城的房子
 */
public class Demo02Array {
    public static void main(String[] args) {
        //创建数组one
        int[] one = new int[2];//在苏州吴中购买的房子,one打开这把们的钥匙
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0
        System.out.println(one[1]);//0

        one[0] = 10;
        one[1] = 20;
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0
        System.out.println(one[1]);//0

        System.out.println("--------------------------------------");

        int[] two = new int[2];//在苏州吴中购买的房子,one打开这把们的钥匙
        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//0
        System.out.println(two[1]);//0

        two[0] = 10;
        two[1] = 20;
        System.out.println(two);//[I@677327b6
        System.out.println(two[0]);//0
        System.out.println(two[1]);//0
    }
}
