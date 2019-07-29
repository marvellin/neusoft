package cn.edu.scau.neusoft.controller;

import cn.edu.scau.neusoft.po.Customer;
import cn.edu.scau.neusoft.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomers")
    public String findCustomer(@RequestParam(value = "userIDName",required = false) Integer id, Model model, HttpSession session){
        if (id != null) {
            Customer customer = customerService.findCustomerById(id);
            model.addAttribute("customer", customer);
            return "customer";
        }
        else {
            session.setAttribute("msg","未输入客户ID！");
            return "inputID";
        }
    }

    @RequestMapping("/tofindCustomer")
    public String toinputID(HttpSession session) {
        session.removeAttribute("msg");
        session.setAttribute("msg","");
        return "inputID";
    }
}
