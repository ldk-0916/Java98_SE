package test;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/9:08
 * 设计一个方法，用于比较两个数组的内容是否相同。
 */
public class Test01 {
    public static void main(String[] args) {
        //定义两个数组,静态初始化定义
        int[] arr = {11,22,33,44,55,66};
        int[] arr2 = {3,4,5,6,7};
        //调用compare
        boolean result = compare(arr, arr2);
        //输出结果
        System.out.println(result);
    }
    public static boolean compare(int[] arr,int[] arr2){
        //首先比较长度
        if (arr.length != arr2.length){
            return false;
        }else {
            //比较内容
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
