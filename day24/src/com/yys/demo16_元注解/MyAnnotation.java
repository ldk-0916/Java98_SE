package com.yys.demo16_元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:46
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //限制该注解只能在方法上和类上使用
    //设置注解要保留到运行阶段
}
