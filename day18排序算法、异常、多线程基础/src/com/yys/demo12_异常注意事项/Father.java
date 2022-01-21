package com.yys.demo12_异常注意事项;

import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/15:12
 */
public class Father {
    public void show() throws ParseException,FileNotFoundException{
        System.out.println("异常show...");
    }
    public void play(){

    }
}
