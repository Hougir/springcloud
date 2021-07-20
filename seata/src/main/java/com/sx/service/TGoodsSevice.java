package com.sx.service;

import com.sx.entity.TGoods;
import com.sx.repository.GoodsRepository;
import com.sx.util.R;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @author huang hao
 * @date 2021年07月16日 17:18
 */
@Service
public class TGoodsSevice {
    @Autowired
    GoodsRepository goodsRepository;

    @Autowired
    RestTemplate restTemplate;

    @GlobalTransactional(rollbackFor = Exception.class)
    public R buy() {
        TGoods tGoods = new TGoods();
        tGoods.setName("苹果");
        tGoods.setPrice(new BigDecimal(88));
        goodsRepository.save(tGoods);

        ResponseEntity<R> forEntity = restTemplate.getForEntity("http://127.0.0.1:8151/order/crete/order", R.class);
        return R.ok(forEntity);
    }
}
