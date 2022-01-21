package com.yys.demo12_异常注意事项;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/15:14
 */
public class Son extends Father {
    //如果父类的方法抛出多个异常,子类重写父类方发时,只能抛出相同(同级别)的异常或者是他的子集
   /* @Override
    public void show() throws ParseException, FileNotFoundException, IOException {

    }*/

   //如果父类方法没有抛出异常,子类覆盖父类方发时也不可抛出异常,此时子类产生异常,只能捕捉
   @Override
    public void play() /*throws ParseException*/{
       try {
           throw new FileNotFoundException("张三");
       }catch (FileNotFoundException e){

       }
   }
}
