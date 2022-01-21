package com.yys.pojo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/11:07
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String gender;
    private String[] hobby;

    public User() {
    }

    public User(String username, String password, String gender, String[] hobby) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
