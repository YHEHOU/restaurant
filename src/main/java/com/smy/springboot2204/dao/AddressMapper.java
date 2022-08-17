package com.smy.springboot2204.dao;

import com.smy.springboot2204.pojo.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}