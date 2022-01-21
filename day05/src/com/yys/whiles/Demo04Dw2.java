package com.yys.whiles;

/**
 三种循环的区别总结:
     1.建议使用的顺序:for,while,do-while
     2.循环次数确定的话,建议使用for,循环次数不确定建议使用while 【后面有使用场景】
     循环次数不确定需要先写成死循环的格式【while好看】    --------后天讲解
     3.do-while循环来讲的话,至少执行一次
     4.while和do-while循环而言,循环结束后,初始化条件中定义的变量可以继续使用,
     但是for循环的不能使用(在for循环内部定义初始化语句)
 */
public class Demo04Dw2 {
    public static void main(String[] args) {
        //for:先判断条件,再执行循环体;条件不成立就不执行
        for (int i = 3; i > 5;i++){
            System.out.println("你好,开门查水表");
        }
        //System.out.println(i);i是在for循环内部使用的,无法在for外部使用
        //for:先判断条件,后执行循环体;如果条件不成立,就不执行
        int j = 3;
        while (j < 5){
            System.out.println("你好,防疫检查..");
            j++;
        }
        System.out.println("=========="+(j+9));
        //do-while:先执行循环体,在判断条件;无论条件成不成立,都会至少执行一次循环体内容

        int k = 3;
        do {
            System.out.println("你好,树先生");
            k++;
        }while (k > 5);
    }
}
