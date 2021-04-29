package com.guoquan.promotion.service;

import com.guoquan.promotion.dao.entity.single.SingleActivityOrderGoods;

import java.util.List;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/4/29 20:09
 */
public interface SingleActivityOrderGoodsService {
    List<SingleActivityOrderGoods> getList(Byte s);
}
