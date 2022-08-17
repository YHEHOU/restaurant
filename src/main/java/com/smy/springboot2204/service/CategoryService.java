package com.smy.springboot2204.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smy.springboot2204.pojo.Category;
import com.smy.springboot2204.pojo.Restaurant;


public interface CategoryService extends IService<Category> {
 //新增菜品分类
    public int insertNewCate(Category category);

     //修改菜品分类
    public int updateCate(Category category);

    //删除菜品分类
    public int deleteCate(int cateId);
}
