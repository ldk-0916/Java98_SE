package com.yys02;

/**
 注意1.:
 1.数组名称保存数组在堆内存中的地址值
 2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

 注意2:
 1.数组名称保存数组在堆内存空间的地址值
 2.使用数组名进行赋值时,传递的是地址值
 3.使用数组名作为方法参数和返回值,传递的都是地址值  --------后面讲解

 有一套房子,在吴中,但是该房子有两把钥匙,分别是one和two
 one: 你自己拿着  打开的是吴中的房子
 two: 你对象拿着  打开的是吴中的房子


 */
public class Demo03Array {
    public static void main(String[] args) {
        //创建数组one
        int[] one = new int[2];//在苏州吴中购买的房子,one打开这把们的钥匙
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0
        one[0] = 10;
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);//0

        /*
            one保存的是数组在内存中的地址值;把他复制给了新的数组two,导致one和two两个地址值是一样的(保存的是相同的地址值)
            操作的就是同一个数组
         */
       int[] two = one;
        System.out.println(two);//[I@1540e19d 一样的
        System.out.println(two[0]);
        two[0] = 100;
        System.out.println(two);
        System.out.println(one[0]);//100
        System.out.println(two[0]);//100

    }
}
