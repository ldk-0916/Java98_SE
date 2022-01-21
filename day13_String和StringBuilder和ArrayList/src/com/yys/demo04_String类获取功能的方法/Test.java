package com.yys.demo04_String类获取功能的方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/15:05
 */
public class Test {
    public static void main(String[] args) {
        /*
             public int length () ：返回此字符串的长度。
             public String concat (String str) ：将指定的字符串连接到该字符串的末尾。拼接
             public char charAt (int index) ：返回指定索引处的 char值。
             public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
             public int indexOf(String str, int fromIndex)  返回从指定索引位置查找,该子字符串第一次出现在该字符串内的索引。
             public int lastIndexOf(String str) 返回指定子字符串最后一次出现在该字符串内的索引。
             public int lastIndexOf(String str, int fromIndex) 返回从指定索引位置查找,,该子字符串最后一次出现在该字符串内的索引。
             public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
             public String substring (int beginIndex, int endIndex) ：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
         */
        //创建字符串对象
        String str = "hello-world!";
        //1.获取字符串长度(个数)
        System.out.println("字符串长度:" + str.length());//长度:12
        //2.将指定的字符串连接到该字符串末尾
        String concat = str.concat("hello-fy");
        System.out.println("拼接后的字符串:" + concat);
        String s = str + "abc";//也是拼接方法
        System.out.println(s);

        //任何数据加上空的字符串都会变成字符串类型
        int num = 10;
        String s1 = num + "";
        System.out.println("="+s1+"=");

        //3.返回str中索引为2的值
        char c = str.charAt(1);
        System.out.println("索引为2的字符:" + c);//e
        System.out.println("------------------------------------------");

        //创建字符串对象
        String str1 = "hello-world-hello-itfy-hello-java-hello-itfy-helloitfy";

        //4.查找fy第一次出现的索引位置
        int index1 = str1.indexOf("fy");
        System.out.println("fy第一次出现索引的位置:" + index1);

        //5.查找fy第二次出现的索引位置
        int index2 = str1.indexOf("fy", index1+1);
        System.out.println("fy第二次出现的索引位置:"+index2);
        //6,查找第三次fy出现的索引位置,同上...
        System.out.println(str1.indexOf("fy",index2+1));

        System.out.println("----------------------------------------------------------");
        //7.返回指定子字符串最后一次出现在该字符串内的索引:hello
        int lastIndex1 = str1.lastIndexOf("hello");
        System.out.println("hello最后一次出现的索引位置:" + lastIndex1);

        //查找倒数第二个hello的索引位置
        int lastIndex2 = str1.lastIndexOf("hello", lastIndex1 - 1);
        System.out.println("hello倒数第二次出现索引的位置:" + lastIndex2);

        System.out.println("==============================================");
        //获取 -world子字符串
        String substring1 = str1.substring(5,11);
        System.out.println("substring1:"+substring1);


    }
}
