package com.yys.demo15_给注解属性赋值的注意事项;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:38
 */
@MyAnnotation01(arr = {1,2})
@MyAnnotation02(value = "张三",n = 1)//此时,value可以省略,因为他只有一个属性
public class Test {
}
