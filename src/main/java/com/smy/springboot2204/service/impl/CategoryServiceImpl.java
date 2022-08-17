package com.smy.springboot2204.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smy.springboot2204.dao.CategoryMapper;
import com.smy.springboot2204.pojo.Category;
import com.smy.springboot2204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
//新增菜品类型
    @Override
    public int insertNewCate(Category category) {
        return categoryMapper.insert(category);
    }
//修改菜品类型

    @Override
    public int updateCate(Category category) {
        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    //删除门店

    @Override
    public int deleteCate(int cateId) {
        return categoryMapper.deleteByPrimaryKey(cateId);
    }
}
