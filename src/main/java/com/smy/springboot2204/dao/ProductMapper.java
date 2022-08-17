package com.smy.springboot2204.dao;

import com.smy.springboot2204.pojo.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}