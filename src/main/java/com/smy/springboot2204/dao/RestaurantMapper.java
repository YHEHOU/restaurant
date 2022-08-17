package com.smy.springboot2204.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smy.springboot2204.pojo.Order;
import com.smy.springboot2204.pojo.Restaurant;


import java.util.List;

public interface RestaurantMapper extends BaseMapper<Restaurant> {
    //删除门店
    int deleteByPrimaryKey(Integer restId);
    //新增门店
    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Integer restId);
    //修改门店
    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    //根据上传的图片，修改数据库里的值
    int updatePhoto(Integer restId,String restPhoto);

    //根据restId多表查询到到tbl_order表
    List<Order> selectOrderByName(Integer restId);
}