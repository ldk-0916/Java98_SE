package com.yys.demo14_字符串拼接升级版案例;


/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/14:06
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
​	并在控制台输出结果。例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
         */
        int[] arr = {1,2,3};
        System.out.println(arrMethod(arr));
    }
    public static String arrMethod(int[] stringBuilder){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringBuilder.length; i++) {
            int e = stringBuilder[i];
            if (i == 0){
                sb.append("[").append(e).append(", ");
            }else if (i == stringBuilder.length-1){
                sb.append(e).append("]");
            }else{
                sb.append(e).append(", ");
            }
        }
        return sb.toString();
    }
}
