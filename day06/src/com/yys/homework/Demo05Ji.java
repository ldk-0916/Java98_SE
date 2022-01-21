package com.yys.homework;

/**
 我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
 ​    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 */
public class Demo05Ji {
    public static void main(String[] args) {
        //外循环,表示鸡翁
        for (int x = 0; x <= 100/5; x++){
            //第二层表示鸡母
            for (int y = 0; y <= 100/3; y++){
                //鸡雏
                int z = 100 - x - y;
                //判断
                if (5*x + 3*y + z/3 == 100 && z%3 == 0){
                    System.out.println(x+","+ y+","+z);
                }
            }
        }
    }
}
