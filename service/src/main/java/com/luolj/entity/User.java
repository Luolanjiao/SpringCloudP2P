package com.luolj.entity;

import java.util.Date;

/**
 * @author luolanjiao
 * @date 2019/3/18
 */
public class User {


 public User(String name, int age, Date createTime) {
  this.name = name;
  this.age = age;
  CreateTime = createTime;
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
  return CreateTime;
 }

 public void setCreateTime(Date createTime) {
  CreateTime = createTime;
 }

 private String  name;
 private int  age;
 private Date CreateTime;

}
