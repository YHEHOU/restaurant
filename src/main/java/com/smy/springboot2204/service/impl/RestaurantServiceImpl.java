package com.smy.springboot2204.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smy.springboot2204.dao.RestaurantMapper;
import com.smy.springboot2204.pojo.Order;
import com.smy.springboot2204.pojo.Restaurant;
import com.smy.springboot2204.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl extends ServiceImpl<RestaurantMapper,Restaurant> implements RestaurantService {

@Autowired
    private RestaurantMapper restaurantMapper;
////查询全部门店
//    @Override
//    public List<Restaurant> selectAllRest() {
//        return restaurantMapper.selectAllRest();
//    }
//修改门店
    @Override
    public int updateRest(Restaurant restaurant) {
        return restaurantMapper.updateByPrimaryKeySelective(restaurant);
    }
//删除门店
    @Override
    public int deleteRest(int restId) {
        return restaurantMapper.deleteByPrimaryKey(restId);
    }
//新增门店
    @Override
    public int insertNewRest(Restaurant restaurant) {
        return restaurantMapper.insert(restaurant);
    }
//更新图片
    @Override
    public int updatePhoto(int restId,String restPhoto) {
        return restaurantMapper.updatePhoto(restId,restPhoto);
    }
//多表查询

    @Override
    public List<Order> selectOrderByName(int restId) {
        return restaurantMapper.selectOrderByName(restId);
    }
}
