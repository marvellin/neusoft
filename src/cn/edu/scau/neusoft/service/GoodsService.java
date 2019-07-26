package cn.edu.scau.neusoft.service;

import cn.edu.scau.neusoft.po.Goods;

import java.util.ArrayList;

public interface GoodsService {
    boolean save(Goods g);
    ArrayList<Goods> getGoods();
}
