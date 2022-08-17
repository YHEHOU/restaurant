package com.smy.springboot2204.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smy.springboot2204.pojo.Order;
import com.smy.springboot2204.pojo.Restaurant;

import java.util.List;

public interface RestaurantService extends IService<Restaurant> {
//    //查询所有门店
//    public List<Restaurant> selectAllRest();
    //修改门店
    public int updateRest(Restaurant restaurant);
    //删除门店
    public int deleteRest(int restId);
    //新增门店
    public int insertNewRest(Restaurant restaurant);
    //将空白的图片数据覆盖为存储路径的值
    public int updatePhoto(int restId,String restPhoto);
    //多表查询
    public List<Order> selectOrderByName(int restId);

}
