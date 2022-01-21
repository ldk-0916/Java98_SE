package test;

import java.util.Random;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/9:22
 * 一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，
 * 奖项的出现顺序要随机且不重复。打印效果如下
 * 2号被抽出来了
 * 588被抽出来了
 * 888被抽出来了
 * 1000被抽出来了
 * 10000被抽出来了
 *
 * 每个奖项只能被抽出一次,
 */
public class Test02 {
    public static void main(String[] args) {
        //1.定义一个数组,存放奖金
        int[] arr = {2,588,888,1000,10000};
        //2.定义一个数组存放已经被取出过得奖金
        int[] brr = new int[5];
        //3.定义一个变量index,brr的数组索引
        int index = 0;
        //4.创建随机数
        Random r = new Random();
        //5.定义循环反复获取随机数,如果index小于arr数组的长度,循环继续
        while (index < arr.length){
            //产生一个随机数索引对应一个奖金
            int i = r.nextInt(arr.length);
            //进行判断奖金是否被获取过
            boolean b = exist(brr,arr[i]);
            //代表奖金没有被抽中,为false
            if (!b){
                //把获取之后的奖金存放到brr中
                brr [index] = arr[i];
                index++;
                //打印出本次被抽奖项
                System.out.println(arr[i]+"元素奖金被抽出....");
            }
        }

    }
    //定义一个方法,判断brr中是否包含这个num数字
    public static boolean exist(int[] brr,int num){
        for (int i = 0; i < brr.length; i++) {
            //如果有该数字,返回true
            if (brr[i] == num){
                return true;
            }
        }
        //如果没有则返回false
        return false;
    }

}
