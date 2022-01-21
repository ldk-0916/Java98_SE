package com.main;

import com.domain.Student;
import com.domain.Teacher;
import com.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/20/11:05
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建学生集合,集合类型为Student
        ArrayList<Student> stuList = new ArrayList<>();
        //创建老师集合,集合类型为Teacher
        ArrayList<Teacher> teaList = new ArrayList<>();

        //循环生成主菜单
        while (true){
            System.out.println("=======================================================================");
            System.out.println("1.学生信息管理系统  2.教师信息管理系统  3.退出系统");
            System.out.println();
            System.out.println("请输入功能序号:");
            int choice = sc.nextInt();
            //判断用户选择功能号
            switch (choice){
                case 1:
                    //进入学生管理系统
                    studentMange(stuList,sc);
                    break;
                case 2:
                    //进入到教师管理系统
                    break;
                case 3:
                    //退出
                    System.out.println("你已退出系统,欢迎下次再来!");
                    System.exit(0);
                default:
                    System.out.println("你您输入的有误,请重新输入!");
                    break;
            }
        }

    }
    /**
     * 学生信息管理
     */
    public static void studentMange(ArrayList<Student> list,Scanner sc){
        while (true) {
            System.out.println("=======================================================================");
            System.out.println("欢迎来到学生信息管理: ");
            System.out.println("1.添加学生  2.查询学生  3.修改学生  4.删除学生  5.返回");
            System.out.println("请输入功能序号: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //添加学生
                    addStudent(list,sc);
                    break;
                case 2:
                    //查询学生
                    selectStudent(list);
                    break;
                case 3:
                    //修改学生
                    updateStudent(list,sc);
                    break;
                case 4:
                    //删除学生
                    deleteStudent(list,sc);
                    break;
                case 5:
                    //返回一级菜单
                    return;
                default:
                    System.out.println("您输入的有误,请重新输入!");
                    break;
            }
        }
    }

    /**
     * 添加学生
     * @param list
     * @param sc
     */
    public static void addStudent(ArrayList<Student> list,Scanner sc){
        //1.输入学生信息
        System.out.println("请输入学生姓名:");
        String name = sc.next();

        System.out.println("请输入性别:");
        String sex = sc.next();

        System.out.println("请输入出生日期:");
        String birthday = sc.next();

        //2.创建学生对象
        Student stu = new Student();

        //3.把键盘录入的信息存储到学生对象当中
        stu.setId(Utils.sid);
        stu.setName(name);
        stu.setSex(sex);
        stu.setBirthday(birthday);
        stu.setAge(Utils.birthdayToAge(birthday));

        //4.把学生对象存储到学生集合当中;
        list.add(stu);
        System.out.println("添加成功");
    }

    /**
     * 查询学生
     * @param list
     */
    public static void selectStudent(ArrayList<Student> list){
        //1.首先判断集合中是否有数据
        //2.如果有学生,就显示,没学生就显示提示信息
        if (list.size() == 0){
            System.out.println("没有数据!");
            return;
        }
        //3.如果有学生,把集合中的所有元素按照指定格式打印输出
        Utils.printArrayList(list);
    }

    public static void updateStudent(ArrayList<Student> list,Scanner sc){
        //1.输入要修改的学生编号
        System.out.println("请输入你要修改的学生编号: ");
        int sid = sc.nextInt();

        //2.判断要修改的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            //2.1遍历出来学生对象
            Student stu = list.get(i);
            //2.2判断我们遍历出来的学生对象的id和输入的id是否相同
            if (stu.getId() == sid){
                //3.如果存在,就修改;
                System.out.println("你要修改的学生信息是: ");
                Utils.printPerson(stu);

                /**
                 * 修改信息
                 */
                System.out.println("请输入新的姓名(保留原值输入0): ");
                String name = sc.next();

                System.out.println("请输入新的性别(保留原值输入0): ");
                String sex = sc.next();

                System.out.println("请输入新的出生日期,格式为yyyy-MM-dd(保留原值输入0): ");
                String birthday = sc.next();
                //判断输入的信息
                if (!"0".equals(name)){
                    stu.setName(name);
                }
                if (!"0".equals(sex)){
                    stu.setSex(sex);
                }
                if (!"0".equals(birthday)){
                    stu.setBirthday(birthday);
                    //修改年龄
                    stu.setAge(Utils.birthdayToAge(birthday));
                }

                //修改玩之后,结束方法,给他提示
                System.out.println("学生信息修改成功!");
                return;
            }

            //3.如果要修改的编号不存在,就给他提示
            System.out.println("错误信息: 你修改的学生编号" + sid + "不存在");
        }

    }

    /**
     * 删除学生信息
     * @param list
     * @param sc
     */
    public static void deleteStudent(ArrayList<Student> list,Scanner sc){
        //1.输入要删除的学生编号
        System.out.println("请输入要删除的学生编号: ");
        int sid = sc.nextInt();

        //2.判断要删除的学生编号是否存在
        for (int i = 0; i < list.size(); i++) {
            //2.1获取学生对象
            Student stu = list.get(i);
            //2.2判断遍历出来的学生对象的id和要删除改的学生id是否相同
            if (stu.getId() == sid){
                //3.如果存在,就删除
                System.out.println("你要删除的学员信息: ");
                Utils.printPerson(stu);

                //4.确定要删除
                System.out.println("确定要删除吗这条信息吗 (y/n) :");
                String next = sc.next();

                //5.判断用户输入
                if (next.equalsIgnoreCase("n")){
                    //如果是n就取消删除
                    System.out.println("删除操作已被取消");
                }
                if (next.equalsIgnoreCase("y")){
                    //如果数的是y,就删除
                    list.remove(i);
                    System.out.println("删除成功!");
                }
                return;
            }
        }

        //6.如果不存在,就显示提示信息,结束方法
        System.out.println("错误信息: 你要删除的学生编号:"+ sid +"不存在" );
    }
}
