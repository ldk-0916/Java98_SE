package com.yys.demo06_throw关键字的作用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/9:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            throw关键字:
                作用:就是用来抛出一个异常对象,将这个异常对象传递到调用者处,并结束当前方法的执行
                throw 异常对象
         */
        int[] arr = {1,2,3,4,5};
        method(arr,5);
    }

    /**
     * 查找指定索引位置的元素
     * @param arr
     * @param index
     */
    public static void method(int[] arr,int index){
        if (index < 0 || index > arr.length - 1){
            //索引不存在,产生一个异常
            throw new ArrayIndexOutOfBoundsException(index + "zs");
        }else {
            int nums = arr[index];
            System.out.println(nums);
        }
    }
}
