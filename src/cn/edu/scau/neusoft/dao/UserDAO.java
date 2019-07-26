package cn.edu.scau.neusoft.dao;

import cn.edu.scau.neusoft.po.User;

import javax.jws.soap.SOAPBinding;

public interface UserDAO {
    public User findUserById(Integer id);
    public User findUserByName(String name);
}
