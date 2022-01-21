package com.yys.whiles;

import java.security.spec.DSAGenParameterSpec;

/**
 * for(;;){}
 *
 *       (3)do-while循环的死循环格式
 *                 do{
 *                     ...
 *                 }while(true);
 */
public class Demo05 {
    public static void main(String[] args) {
        /*for (;true;){
            System.out.println("上课玩手机..");
        }*/
        /*while (true){
            System.out.println("上课玩手机打一顿..");
        }*/

        do {
            System.out.println("死循环...");
        }while (true);
    }
}
