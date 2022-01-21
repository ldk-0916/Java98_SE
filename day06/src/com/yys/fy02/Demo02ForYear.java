package com.yys.fy02;

/**
 需求:
 使用嵌套循环，打印2021年至2023年月份，格式：xxxx年x月
 */
public class Demo02ForYear {
    public static void main(String[] args) {
        //年作为外循环,月份作为内循环
        for (int year = 2021; year <= 2023; year++ ){//外循环控制年
            for (int month = 1; month <= 12; month++){//内循环控制月份

                for (int ri = 1 ; ri <= 30; ri++){
                    System.out.println(year + "年" + month + "月"+ ri + "日");
                }
            }
        }
    }
}
