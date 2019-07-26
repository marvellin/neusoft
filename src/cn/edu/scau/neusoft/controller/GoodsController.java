package cn.edu.scau.neusoft.controller;

import cn.edu.scau.neusoft.po.Goods;
import cn.edu.scau.neusoft.service.GoodsService;
import cn.edu.scau.neusoft.validator.GoodsValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    private static final Log logger = LogFactory.getLog(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @Resource
    private GoodsValidator goodsValidator;

    @RequestMapping("/input")
    public String input(Model model){
        model.addAttribute("goods",new Goods());
        return "addGoods";
    }

    @RequestMapping("/save")
    public String svae(@ModelAttribute("goods")Goods goods, BindingResult result, Model model){
        this.goodsValidator.validate(goods, result);
        if (result.hasErrors()) {
            return "addGoods";
        }
        goodsService.save(goods);
        System.out.println("添加成功！");
        model.addAttribute("goodsList",goodsService.getGoods());
        return "goodsList";
    }
}
