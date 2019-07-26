package cn.edu.scau.neusoft.service.impl;

import cn.edu.scau.neusoft.po.Goods;
import cn.edu.scau.neusoft.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GoodsServiceImpl implements GoodsService {
    private static ArrayList<Goods> goods = new ArrayList<Goods>();

    public boolean save(Goods g) {
        goods.add(g);
        return true;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }
}
