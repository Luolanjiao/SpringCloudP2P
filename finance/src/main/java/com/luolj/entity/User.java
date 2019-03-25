package com.luolj.entity;

import java.util.Date;

/**
 * @author luolanjiao
 * @date 2019/3/18
 */
public class User {

    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age, Date createTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.createTime = createTime;
    }

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
