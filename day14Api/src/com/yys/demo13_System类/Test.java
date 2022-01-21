package com.yys.demo13_System类;

import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/10:54
 */
public class Test {
    public static void main(String[] args) {
        /*
            System类:java.lang.System类中提供了大量的静态方法
            System类的方法:
                exit():终止当前运行
                curentTimeMillis()返回当前时间距离标准基准时间的毫秒值(毫秒为单位)

               额外增加:
                    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 拷贝数组中的元素到另一个数组
                          参数1src: 源数组
                          参数2srcPos:源数组要拷贝的元素的起始索引(从哪个索引位置开始拷贝)
                          参数3dest: 目标数组
                          参数4destPos:目标数组接收拷贝元素的起始索引(从哪个索引位置开始接收)
                          参数5length:需要拷贝多少个元素(拷贝多少个

         */
        System.out.println("程序开始...");
       /* System.exit(0);//程序正常退出
        System.exit(-1);//非正常推迟*/

        //获取当前时间的标准基准时间的毫秒值
        Date date1 = new Date();
        System.out.println(date1.getTime());//毫秒值:1634612596706
        System.out.println(System.currentTimeMillis());//1634612596706

        //拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {11,22,33,44,55,66};
        System.arraycopy(arr1,1,arr2,3,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]+" ");
        }
        System.out.println();
    }
}
