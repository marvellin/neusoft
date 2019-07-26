package cn.edu.scau.neusoft.dao.impl;

import cn.edu.scau.neusoft.dao.CustomerDAO;
import cn.edu.scau.neusoft.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDAOImpl extends SqlSessionDaoSupport implements CustomerDAO {

    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("cn.edu.scau.neusoft.dao.CustomerDAO.findCustomerById",id);
    }
}
