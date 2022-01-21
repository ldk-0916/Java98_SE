package com.yys.demo06_目录的遍历;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/15:13
 */
public class Test {
    public static void main(String[] args) {
        /*
            遍历目录方法:
                list():返回一个String数组,表示该目录中的所有子文件或目录的名称
                listFiles():返回一个File数组,表示该File目录中的所有子文件或目录的路径
         */
        //创建File对象
        File f1 = new File("File类_流\\aaa");
        //获取f1下面的所有子文件或目录们名称
        String[] arr1 = f1.list();
        //循环
        for (String names : arr1) {
            System.out.println(names);
        }

        //获取路径遍历
        File[] arr2 = f1.listFiles();
        for (File file : arr2) {
            System.out.println(file);
        }

        //文件没有访问权限,就会输出打印为null,遍历还会报空指针异常:java.lang.NullPointerException
        File f2 = new File("C:\\System Volume Information");
        String[] list = f2.list();
        File[] files = f2.listFiles();
        System.out.println(list+":"+files);//null

        //每一次遍历之前,进行判断,增加严谨性,健壮性
        if (files != null){
            //进行遍历...
        }

        //注意:如果文件夹不存在,输出为null,遍历报空指针异常:java.lang.NullPointerException
        File f3 = new File("D:\\abc");
        String[] list1 = f3.list();
        File[] files1 = f3.listFiles();
        System.out.println(list1+":"+files1);
        for (String ss : list1) {
            System.out.println(ss);
        }
    }
}
