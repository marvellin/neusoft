package cn.edu.scau.neusoft.controller;

import cn.edu.scau.neusoft.po.User;
import cn.edu.scau.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/torestful")
    public String torestful() {
        System.out.println("torestful test");
        return "restful";
    }

    @RequestMapping("/json")
    @ResponseBody
    public User testJson(@RequestBody User user) {
        System.out.println(user.toString());
        return user;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable("id")String userid){
        System.out.println("userID=" + userid);
        User user = new User();
        if ("123".equals(userid)) {
            user.setUserName("tom");
            user.setPassword("123456");
        }
        return user;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        String username = user.getUserName();
        String password = user.getPassword();
//        System.out.println(user.toString());
        if (username != null && password != null && !username.equals("") && !password.equals("")) {
            User checkuser = userService.findUserByName(username);
            System.out.println(checkuser.toString());
            if (checkuser.getPassword().equals(password)) {
                session.setAttribute("USERNAME", checkuser);
                return "redirect:main";
            }
            else {
                model.addAttribute("msg","输入的用户名或密码有误，请重新输入");
                return "login";
            }
        }
        else {
            model.addAttribute("msg", "输入的用户名或密码为空，请重新输入！");
            return "login";
        }
    }

    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login";
    }
}
