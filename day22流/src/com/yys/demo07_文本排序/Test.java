package com.yys.demo07_文本排序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/13:34
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //文本排序
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //字符缓冲流来读取
        FileReader fr = new FileReader("File类_流\\aaa\\b.txt");
        BufferedReader br = new BufferedReader(fr);

        //定义一个变量,用来接收读取到字符串数据
        String line;
        //循环读取
        while ((line = br.readLine()) != null){
            //读取到的数据存储到集合中
            list.add(line);
        }
        br.close();

        //排序
        Collections.sort(list);
        //创建缓冲输出流
        FileWriter fw = new FileWriter("File类_流\\aaa\\b.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (String text : list) {
            bw.write(text);
            bw.newLine();
        }
        bw.close();
    }
}
