package com.yys.demo13_自定义异常;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/16:21
 */
public class RegisterException extends RuntimeException {
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
