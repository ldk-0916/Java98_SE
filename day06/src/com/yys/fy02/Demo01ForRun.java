package com.yys.fy02;

/**
 1.需求:
 (1)教练安排运动员跑圈
 (2)教练总共安排3次,每次跑3圈
 */
public class Demo01ForRun {
    public static void main(String[] args) {
        /*
            外循环控制次数:第一次:i = 1,i <= 3  --->true,执行外循环循环体
                内层循环:
                    j:1,2,3(执行三次内循环输出语句..)
                    ...同理
         */
        for (int i = 1; i <= 3;i++){
            //外循环控制次数
            System.out.println("教练安排跑第"+i+"次");
            for (int j = 1; j <= 3; j++){
                //内循环控制圈数
                System.out.println("运动员跑第"+j+"圈");
            }
        }
    }
}
