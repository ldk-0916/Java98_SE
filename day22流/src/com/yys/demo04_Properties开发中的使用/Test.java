package com.yys.demo04_Properties开发中的使用;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/9:53
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            开发中的使用:
                1.开发中的配置文件一般是后缀为.properties文件
                2.开发中配置文件一般放在src目录下面
                3.开发中配置文件内容一般不允许出现中文
                4.开发中,一般只会去配置文件中读取数据'

              public void store(OutputStream out, String comments):把Properties对象中的键值对写回配置文件中
                public void store(Writer w, String comments):把Properties对象中的键值对写回配置文件中
                public void load(Reader reader)
         */
        //创建对象
        Properties pro = new Properties();
        //调用load方法加载配置文件
        //pro.load(new FileInputStream("File类_流\\aaa\\a.txt"));
        //直接获取一个流,该流默认的路径已经到src下面了
        InputStream is = Test.class.getClassLoader().getResourceAsStream("db.properties");
        pro.load(is);
        //System.out.println(pro);

        //获取键
        Set<String> keys = pro.stringPropertyNames();
        for (String key : keys) {
            Object value = pro.get(key);
            System.out.println(value);
        }
        System.out.println("----------------------------------");
        //添加一个键值对
        pro.setProperty("name","zs");
        //重新写进去
        pro.store(new FileOutputStream("day22流\\src\\db.properties"),"yys");

        System.out.println("-------------------------------");
        //修改配置文件值
        /*pro.setProperty("password","123456");
        pro.store(new FileOutputStream("day22流\\src\\db.properties"),"com");*/
    }
}
