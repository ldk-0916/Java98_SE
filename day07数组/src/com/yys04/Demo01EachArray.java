package com.yys04;

/**
 数组的遍历:就是将数组中的每个元素分别获取出来就是遍历;
 */
public class Demo01EachArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //除了索引不一样,
        //for循环,把索引当做变量
      /*  for (int i = 0;i <= 4; i++){
            System.out.println("元素值:"+arr[i]);
        }*/

      for (int i = 0; i < arr.length; i++){
          System.out.println("元素值:"+arr[i]);
      }
    }
}
