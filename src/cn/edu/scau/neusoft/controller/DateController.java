package cn.edu.scau.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class DateController {
    @RequestMapping("todate")
    public String todate(){
        return "date";
    }

    @RequestMapping(value = "date",method = RequestMethod.POST)
    public String date(@RequestParam(value = "date",required = false)String date, Model model){
        model.addAttribute("msg",date);
        System.out.println(date.getClass());
        return "datesuccess";
    }
}
