package com.yys.fy01;

/**
 continue的使用场景:
 1.只能使用在循环中,作用是提前结束本次循环,继续进行下一次循环
 2.不能使用在除循环结构中的其它位置

 买包子案例:


 break和continue的区别:
    break:是把循环终止了,结束循环;
    continue:跳过本次循环,继续执行下一次循环
 */
public class Demo03Continue {
    public static void main(String[] args) {
        for (int num = 1; num <= 4; num++){
            if (num == 2){
                /*
                    contuine是跳过本次循环,继续执行下一次循环
                 */
                System.out.println("发现2号包子脏了,不能吃2号包子,继续吃其他的包子...");
                continue;
            }
            System.out.println("顾客吃第"+num+"个包子");
        }
        System.out.println("找老板赔钱,说:你这包子脏了,得赔钱;老板:我开包子铺,能卖你脏包子?不赔滚...");
    }
}
