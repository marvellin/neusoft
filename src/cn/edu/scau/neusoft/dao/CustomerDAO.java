package cn.edu.scau.neusoft.dao;

import cn.edu.scau.neusoft.po.Customer;

public interface CustomerDAO {
    public Customer findCustomerById(Integer id);
}
