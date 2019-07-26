package cn.edu.scau.neusoft.service.impl;

import cn.edu.scau.neusoft.dao.CustomerDAO;
import cn.edu.scau.neusoft.po.Customer;
import cn.edu.scau.neusoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    public Customer findCustomerById(Integer id) {
        return customerDAO.findCustomerById(id);
    }
}
