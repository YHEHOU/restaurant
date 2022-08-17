package com.smy.springboot2204.dao;

import com.smy.springboot2204.pojo.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}