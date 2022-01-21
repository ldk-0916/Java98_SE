package com.yys.demo03_Properties类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/9:32
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            Properties类的使用:
                概述:`java.util.Properties ` 继承于` Hashtable` ，来表示一个持久的属性集
                特点:
                    1.Properties当成Map集合使用时,键和值类型为Object类型
                    1.Properties当成属性集使用时,键和值类型为String类型

                构造方法:`public Properties()` :创建一个空的属性列表
                成员方法:
                - `public Object setProperty(String key, String value)` ： 保存一对属性。
                - `public String getProperty(String key) ` ：使用此属性列表中指定的键搜索属性值。
                - `public Set<String> stringPropertyNames() ` ：所有键的名称的集合

               注意:文本中的数据,必须是键值对形式,可以使用空格、冒号、等号等等符号分离

                - `public void load(InputStream inStream)`： 从字节输入流中读取键值对。
                    参数中使用了字节输入流，通过流对象，可以关联到某文件上，这样就能够加载文本中的数据了。

         */
        //创建Properties对象
        Properties pro = new Properties();
        //存储键值对
        pro.setProperty("k1","v1");
        pro.setProperty("k2","v2");
        pro.setProperty("k3","v3");
        pro.setProperty("k4","v4");

        //获取所有的键
        Set<String> keys = pro.stringPropertyNames();
        System.out.println(keys);

        //根据键找值
        for (String key : keys) {
            String value = pro.getProperty(key);
            System.out.println(value);
        }

        //需求:把a.txt文件的数据加载到pro对象中
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\a.txt");
        //加载文件中的数据
        pro.load(fis);
        //关闭流
        fis.close();
        System.out.println(pro);
    }
}
