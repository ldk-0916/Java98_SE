package com.yys03;

/**
 需求(先不定义方法):
 设计一个方法用于数组遍历(打印数组元素)，
 要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]

 举例:
 原数组: {11,22,33,44,55}
 打印格式:[11, 22, 33, 44, 55]
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        System.out.print("[");
        for (int i = 0;i < arr.length;i++){
            /*if (i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }*/
            System.out.print(arr[i]);
            if (i != arr.length-1){
                System.out.print(", ");
            }
        }
        //System.out.print(arr[arr.length-1]);
        System.out.println("]");
      // metod(arr);
    }

    public static void metod(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("[" + arr[i] + ", ");
            }else if (i > 0 && i < arr.length-1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i] + "]");
            }
        }
    }
}
