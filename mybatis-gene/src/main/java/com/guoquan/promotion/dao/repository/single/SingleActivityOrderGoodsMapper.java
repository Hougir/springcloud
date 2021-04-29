package com.guoquan.promotion.dao.repository.single;

import com.guoquan.promotion.dao.entity.single.SingleActivityOrderGoods;
import com.guoquan.promotion.dao.entity.single.SingleActivityOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleActivityOrderGoodsMapper {
    long countByExample(SingleActivityOrderGoodsExample example);

    int deleteByExample(SingleActivityOrderGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SingleActivityOrderGoods record);

    int insertSelective(SingleActivityOrderGoods record);

    List<SingleActivityOrderGoods> selectByExample(SingleActivityOrderGoodsExample example);

    SingleActivityOrderGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SingleActivityOrderGoods record, @Param("example") SingleActivityOrderGoodsExample example);

    int updateByExample(@Param("record") SingleActivityOrderGoods record, @Param("example") SingleActivityOrderGoodsExample example);

    int updateByPrimaryKeySelective(SingleActivityOrderGoods record);

    int updateByPrimaryKey(SingleActivityOrderGoods record);

    List<SingleActivityOrderGoods> queryList(@Param("goods_refund_number") Byte goodsRefundNumber);
}