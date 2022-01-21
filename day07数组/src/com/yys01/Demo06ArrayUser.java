package com.yys01;

/**
 简化格式静态初始化数组的使用
 1.数组名称: 代表数组在内存空间的地址值,是一个十六进制的整数数字
 2.索引编号:是一个整数数字
 数组中的每个数据,称之为数组元素
 数组为每个元素进行编号(专业术语叫做索引),该编号从0开始到最大值(数组长度 减 1)
 3.数组元素:
 数组名称[索引编号]
 举例:
 array[3]: 数组array中索引编号为3的元素
 4.获取数组长度:
 数组内部有个length属性,专门记录数组的长度
 数组名称.length: 是一个int数字,代表数组的长度
 */
public class Demo06ArrayUser {
    public static void main(String[] args) {
        //创建一个int类型的数组array
        int[] array ={10,20,30};//0代表10, 下标1代表20,下标2代表30
        //获取元素:数组名称[索引编号]
        System.out.println(array[2]);//java.lang.ArrayIndexOutOfBoundsException:下标越界异常(运行时异常)
        System.out.println(array);//[I@1540e19d:数组在内存空间的地址值,16进制的整数数字

        System.out.println("------------------------------------");
        ////修改10为100
        //array[0] = 100;//把整数100存储到索引为0的元素中
        //array[1] = 200;//同理...
        //array[2] = 300;
        //System.out.println(array[1]);//200

        //获取数组长度
        int len = array.length;
        System.out.println(len);//3

        //获取它数组中的最后一位元素
        //array.length-1:最大下标
        System.out.println(array[array.length-1]);//30
    }
}
