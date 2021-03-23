package com.sx.mapper;

import com.sx.model.ChannelOrderData;

public interface ChannelOrderDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChannelOrderData record);

    int insertSelective(ChannelOrderData record);

    ChannelOrderData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ChannelOrderData record);

    int updateByPrimaryKey(ChannelOrderData record);
}