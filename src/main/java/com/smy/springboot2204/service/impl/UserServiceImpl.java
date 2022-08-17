package com.smy.springboot2204.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smy.springboot2204.dao.UserMapper;
import com.smy.springboot2204.pojo.User;
import com.smy.springboot2204.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
//删除用户
    @Override
    public int deleteUser(int userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }
//添加用户
    @Override
    public int insertNewUser(User user) {
        return userMapper.insert(user);
    }
//更新用户
    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
//查找图片
    @Override
    public int updatePhoto(int userId, String userPic) {
        return userMapper.updatePhoto(userId,userPic);
    }
//通过用户名查找
    @Override
    public User selectByName(String userName) {
        return userMapper.selectByName(userName);
    }

//通过id查找

    @Override
    public User selectById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
