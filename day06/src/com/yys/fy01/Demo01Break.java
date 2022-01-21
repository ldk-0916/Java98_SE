package com.yys.fy01;

/**
 break的使用场景:
 1.使用在switch语句中,用来结束switch语句,执行switch语句后面的其它语句
 2.使用在循环中,用来结束循环(1.本次循环的循环体中break后面的代码不再执行 2.剩余次数的循环也不再执行),
 执行循环后面的其它语句
 3.break不能使用在除switch和循环语句以外的其它位置
 */
public class Demo01Break {
    public static void main(String[] args) {
        System.out.println("顾客去包子铺买了四个包子...");
        for (int num = 1; num <= 4;num++){
            /*
                 当num值为2时,条件为true,执行if里面的语句;当执行完break,本次循环体里面的内容不执行了
             */
            if (num == 2){
                System.out.println("发现2号包子上有苍蝇,2号(以及没吃的)不能吃了,找老板退钱");
                break;
        }
            System.out.println("顾客吃了第"+num+"个包子");
        }
        System.out.println("顾客举报投诉:格老子的,你这是什么包子,给老子退钱;老板:赔你1000元,别举报我...");
    }
}
