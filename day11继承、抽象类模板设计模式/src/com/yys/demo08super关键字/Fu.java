package com.yys.demo08super关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/15:30
 */
public class Fu {
   // int num = 10;
    private String name;
    private int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Zi extends Fu{
    /*int num = 20;
    public void show(){
        int num = 30;
        System.out.println("局部变量num:"+num);
        System.out.println("本类成员变量num:"+this.num);
        System.out.println("父类变量num:"+super.num);
    }*/

    public Zi() {
        //访问父类空参构造
        super();
        System.out.println("Zi 空参构造方法");
    }

    public Zi(String name, int age) {
        super(name, age);
    }
}
class Test{
    public static void main(String[] args) {
        /*
            super访问父类成员变量:super.父类成员变量
            作用:区分父类和本类同名的成员变量
         */
        //Zi zi = new Zi();
        //zi.show();

        /*
            super访问父类构造方法:
                空参构造:super();
                有参构造:super(实参)
                    注意:
                        1.只能在子类的构造方法中访问父类的构造方法
                        2.在子类的构造方法中,使用super调用父类的构造方法,必须放在子类构造方法的第一行
                        3.在子类的构造方法中访问父类的构造方法可以用来初始胡从父类继承过来的属性
                        4.子类的构造方法默认会调用父类的空参构造方法
         */
        Zi zi = new Zi("罗翔",45);
        System.out.println(zi.getName()+":"+zi.getAge());



    }
}
