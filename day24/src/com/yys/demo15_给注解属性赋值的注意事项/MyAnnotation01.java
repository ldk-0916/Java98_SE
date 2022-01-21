package com.yys.demo15_给注解属性赋值的注意事项;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:33
 */

    /*
        -   一旦注解有属性了,使用注解的时候,属性必须有值
            - 若属性类型是一维数组的时候,当数组的值只有一个的时候可以省略{}
            - 如果注解中只有一个属性,并且属性名为value,那么使用注解给注解属性赋值的时候,注解属性名value可以省略
            - 注解属性可以有默认值  格式:属性类型 属性名() default 默认值;
     */
public @interface MyAnnotation01 {
    int[] arr();
}
 @interface MyAnnotation02{
    String value();
    int n();
}
@interface MyAnnotation03{
   String[] value();
}
@interface MyAnnotation04{
    String[] value() default {"程序猿","码农"};
}