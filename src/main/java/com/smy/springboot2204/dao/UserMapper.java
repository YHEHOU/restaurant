package com.smy.springboot2204.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smy.springboot2204.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //根据上传的图片，修改数据库里的值
    int updatePhoto(Integer userId,String userPic);

    User selectByName(String userName);

}