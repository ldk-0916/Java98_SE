package com.yys.demo10_String类常用方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/10:39
 */
public class Test {
    public static void main(String[] args) {
        /*
        ★charAt();  //根据给定的索引，获取对应位置的字符
		★isEmpty(); //判断字符串是否为空(长度为0返回true，不为0返回false)
        ★contains();    //判断字符串中是否包含 给定的字符串。
        endsWith(); //判断字符串是否以 给定的字符串 结尾。
        startsWith(); //判断字符串是否以 给定的字符串 开头。

        ★replace(); //用新内容替代旧内容，返回新的字符串
        toLowerCase();  //把字母都转成其对应的小写形式。
        toUpperCase();  //把字母都转成其对应的大写形式。
		toCharArray() // 把字符串转换为字符数组
		getBytes() // 把字符串转换为字节数组
		★trim();            //移除首尾空格。
		★split();   //根据给定的内容，切割字符串，返回字符串数组
         */
        //判断字符串是否为空
        String str1 = ""; //空字符串
        String str2 = "adc";
        System.out.println(str1.isEmpty());//true

        System.out.println("--------------------------------------");
        //  ★contains();    //判断字符串中是否包含 给定的字符串。
        String str3 = "com-yys-hello-world-java";
        System.out.println(str3.contains("yyds"));//false
        System.out.println(str3.contains("yys"));//true

        System.out.println("============================================");
        //endsWith(); //判断字符串是否以 给定的字符串 结尾。
        System.out.println(str3.endsWith("java"));
        System.out.println(str3.endsWith("a"));
        //startsWith(); //判断字符串是否以 给定的字符串 开头。
        System.out.println(str3.startsWith("c"));//true
        System.out.println("-------------------------------------------------------");

        //★replace(); //用新内容替代旧内容，返回新的字符串
        System.out.println(str3.replace("-java", "-map"));

        //toUpperCase();  //把字母都转成其对应的大写形式。
        String str4 = str3.toUpperCase();
        System.out.println(str4);
        //toLowerCase();  //把字母都转成其对应的小写形式。
        System.out.println(str4.toLowerCase());

        System.out.println("...........................................");
    //    toCharArray() // 把字符串转换为数组
        char[] chs = str3.toCharArray();
        for (int i = 0; i < chs.length ; i++) {
            System.out.print(chs[i]+" ");
        }

        System.out.println();
        //getBytes() // 把字符串转换为字节数组
        byte[] bytes = str3.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }

        System.out.println();
        //移除首尾空格 trim();
        String str5 = "    法外狂徒张三  ";
        String trimStr = str5.trim();
        System.out.println("=" + trimStr + "=");

        //split 根据给定的内容，切割字符串，返回字符串数组
        String str6 = "Hello.World.Hello.wyf";
        //对str6进行切割
        String[] arr = str6.split("wyf");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String[] arr2 = str6.split("\\.");//正则表达式中 .代表任意字符;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
