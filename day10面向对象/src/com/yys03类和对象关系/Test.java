package com.yys03类和对象关系;

/**
 * 创建对象方式:
 * 类名 变量名 = new 类名();
 * 类是一种引用类型
 *对象的使用:
 *  访问成员变量:
 *      给成员变量赋值: 对象名.属性名(成员变量) = 值;
 *      获取成员变量值:对象名.属性(成员变量)
 *
 *   之前访问
 *             方法分类: 无参数无返回值,有参数无返回值,有参数有返回值,无参数有返回值
 *             调用方法: 有返回值的方法,无返回值的方法
 *                 无返回值的方法:
 *                        直接调用: 方法名(实参);
 *                 有返回值的方法:
 *                        直接调用: 方法名(实参);
 *                        赋值调用: 数据类型 变量名 = 方法名(实参);
 *                        输出调用: System.out.println(方法名(实参));
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建Phone对象(new出来的)
        Phone p1 = new Phone();
        //给p1对象的属性赋值(成员变量)
        p1.brand = "小米";
        p1.price = 3999.0;
        //如何获取成员变量的值
        System.out.println(p1.brand);
        System.out.println(p1.price);

        System.out.println("---------------------------------------------");
        /*
            无返回值:直接调用
            访问成员方法:call方法里面含有String类型的形式参数,所以调用方法时,要传递一个参数
         */

        p1.call("10010");
        p1.sendMessage("10010","请问一下那个移动客服号码是多少?");

        //有返回值方法如何调用
        /*
            1.直接调用
            2.赋值调用
            3.输出调用
         */
        p1.show("法外狂徒张三");//直接调用

        //赋值调用
        String zs = p1.show("zs");
        System.out.println(zs+"张三");
        //直接调用
        System.out.println(p1.show("学个屁.."));
    }
}
