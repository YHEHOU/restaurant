package com.smy.springboot2204.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smy.springboot2204.pojo.Restaurant;
import com.smy.springboot2204.pojo.User;

public interface UserService extends IService<User> {
//删除用户
    public int deleteUser(int userId);

     //新增门店
    public int insertNewUser(User user);

     //修改门店
    public int updateUser(User user);

    //将空白的图片数据覆盖为存储路径的值
    public int updatePhoto(int restID,String restPhoto);

    //通过name查找目标信息是否存在
    public User selectByName(String userName);

    //通过id查找目标信息是否存在
    public User selectById(int userId);

}
