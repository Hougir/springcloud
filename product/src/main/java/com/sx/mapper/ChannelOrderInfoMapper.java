package com.sx.mapper;

import com.sx.model.ChannelOrderInfo;

public interface ChannelOrderInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChannelOrderInfo record);

    int insertSelective(ChannelOrderInfo record);

    ChannelOrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChannelOrderInfo record);

    int updateByPrimaryKey(ChannelOrderInfo record);
}