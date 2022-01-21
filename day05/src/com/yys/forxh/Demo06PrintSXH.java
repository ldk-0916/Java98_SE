package com.yys.forxh;

/**
 需求:
 在控制台输出所有的“水仙花数”
 */
public class Demo06PrintSXH {
    public static void main(String[] args) {
        int count = 0;
        int sum ;
        //使用for获取所有的三位数(整数)
        for (int num = 100; num <= 999; num++){
            //三位数,int类型
            int ge = num %  10;//个
            int shi = num / 10 % 10;//十
            int bai = num / 100 % 10;//百

            //求和
            sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            //判断三位数立方之和等于num
            if (sum == num){
                System.out.println(num+"水仙花数");
                count++;
            }
        }
        System.out.println("水仙花总数:"+count);
    }
}
