package cn.edu.scau.neusoft.controller;

import cn.edu.scau.neusoft.po.Customer;
import cn.edu.scau.neusoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomers")
    public String findCustomer(@RequestParam(value = "userIDName") Integer id, Model model){
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }

    @RequestMapping("/tofindCustomer")
    public String toinputID(){
        return "inputID";
    }
}
