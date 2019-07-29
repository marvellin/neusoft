package cn.edu.scau.neusoft.dao.impl;

import cn.edu.scau.neusoft.dao.UserDAO;
import cn.edu.scau.neusoft.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {
    @Override
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("cn.edu.scau.neusoft.dao.UserDAO.findUserById",id);
    }

    @Override
    public User findUserByName(String name) {
        return this.getSqlSession().selectOne("cn.edu.scau.neusoft.dao.UserDAO.findUserByName",name);
    }

    @Override
    public boolean addUser(User user) {
        int result = this.getSqlSession().insert("cn.edu.scau.neusoft.dao.UserDAO.addUser", user);
        this.getSqlSession().commit();
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }
}
