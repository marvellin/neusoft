package cn.edu.scau.neusoft.service;

import cn.edu.scau.neusoft.po.User;

public interface UserService {
    public User findUserById(Integer id);
    public User findUserByName(String name);
}
