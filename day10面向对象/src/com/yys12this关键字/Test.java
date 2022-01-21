package com.yys12this关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            问题1:set方法里的形参名不能做到见名知意(不符合命名规范)
            解决:改成符合命名规范的
            问题2:set方法形参命名规范过后,发现set方法无法给成员变量赋值
            解决:使用this关键键字来区别同名的成员变量和局部变量
            格式:this.成员变量名
            this表示谁(哪一个):哪个对象调用this所在的方法,this就表示哪一个对象

            总结:
                1.如果成员方法中有与成员变量同名的局部变量,那么就需要使用this关键字来区分
                2.没有就不需要使用,直接赋值就行
         */
        Student stu = new Student();
        stu.setName("罗翔");
        stu.setAge(35);
        System.out.println(stu.getName()+":"+stu.getAge());
    }
}
