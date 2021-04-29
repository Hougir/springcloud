package com.guoquan.promotion.service;

import com.guoquan.promotion.dao.entity.single.SingleActivityOrderGoods;
import com.guoquan.promotion.dao.repository.single.SingleActivityOrderGoodsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huang hao
 * @version 1.0
 * @date 2021/4/29 20:14
 */
@Slf4j
@Service
public class SingleActivityOrderGoodsServiceImpl implements SingleActivityOrderGoodsService {
    @Autowired
    SingleActivityOrderGoodsMapper singleActivityOrderGoodsMapper;
    public List<SingleActivityOrderGoods> getList(Byte s) {
        return singleActivityOrderGoodsMapper.queryList(s);
    }

    public static void main(String[] args) {
        SingleActivityOrderGoodsServiceImpl service = new SingleActivityOrderGoodsServiceImpl();
        service.getList(Byte.valueOf("0"));
    }
}
