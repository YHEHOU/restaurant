package com.smy.springboot2204.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smy.springboot2204.pojo.Category;


public interface CategoryMapper extends BaseMapper<Category>{

    int deleteByPrimaryKey(Integer cateId);
//新增菜品分类
    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer cateId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}