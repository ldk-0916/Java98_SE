package com.yys.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/23/10:36
 * BeanUtils工具类:一次性把所有的请求参数封装到javaBean中
 */
public class WebUtils {
    public static <T> T saveParamToBean(Map value,T bean){
        try {
            System.out.println("封装之前:"+bean);
            //把所有的请求参数封装到user里面
            BeanUtils.populate(bean,value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
    public static int parseInt(String strInt,int defaultValue){
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return defaultValue;
    }
}
