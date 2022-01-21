package com.yys.demo02_jdk7的处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/9:20
 */
public class Test {
    public static void main(String[] args) {
        /*
           jdk7的处理 try..with..resource 语句
           特点:该语句确保了资源在语句结束时关闭
           格式:
           try (创建流对象语句，如果多个,使用';'隔开) {
                        // 读写数据
                            } catch (IOException e) {
                                e.printStackTrace();
                        }关闭所谓的资源(resource):是指程序完成后,必须关闭的对象
         */
        //创建对象
        try(
                FileInputStream fis = new FileInputStream("File类_流\\ddd\\a.txt");
                FileOutputStream fos = new FileOutputStream("File类_流\\ddd\\aa.txt");
        ) {
            //定义数组
            byte[] bys = new byte[1024];
            int len;
            while ((len = fis.read(bys)) != -1){
                fos.write(bys,0,len);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
