package cn.edu.scau.neusoft.service.impl;

import cn.edu.scau.neusoft.dao.UserDAO;
import cn.edu.scau.neusoft.po.User;
import cn.edu.scau.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserById(Integer id) {
        return userDAO.findUserById(id);
    }

    @Override
    public User findUserByName(String name) {
        return userDAO.findUserByName(name);
    }
}
