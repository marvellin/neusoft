package cn.edu.scau.neusoft.service;

import cn.edu.scau.neusoft.po.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    public User findUserById(Integer id);
    public User findUserByName(String name);
    public boolean addUser(User user);
}
