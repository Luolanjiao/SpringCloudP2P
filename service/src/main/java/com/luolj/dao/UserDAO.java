package com.luolj.dao;

import com.luolj.entity.User;
import com.luolj.entity.UserMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * @author luolanjiao
 * @date 2019/3/18
 */
//@Mapper
public interface UserDAO {
  ArrayList<User> selectAll();
  UserMap selectUserById(String userId);
  void insertUser(ArrayList<User> userList);
}
