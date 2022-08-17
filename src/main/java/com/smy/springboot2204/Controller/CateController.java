package com.smy.springboot2204.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smy.springboot2204.dto.BaseResult;
import com.smy.springboot2204.dto.PageVO;
import com.smy.springboot2204.pojo.Category;
import com.smy.springboot2204.pojo.Restaurant;
import com.smy.springboot2204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@CrossOrigin
@RequestMapping("/admin")
public class CateController {
    @Autowired
    private CategoryService categoryService;

    //分页查询所有菜品分类
 @RequestMapping("/cateList")
    @ResponseBody
    public PageVO page(@RequestParam(value = "page") int page,
                       @RequestParam(value = "size") int size,
                       String search) {
        Page<Category> itemPage = new Page<>(page, size);
        LambdaQueryWrapper<Category> queryWrapper= new LambdaQueryWrapper<>();
//        非空-模糊查询
        if (search!=null && search!=""){
//            这里是模糊查询like方法，like方法第一个参数为表映射类的字段，
//            为哪个字段进行查询，第二个参数为具体数据；
            queryWrapper.like(Category::getCateName,search);
        }
        Page<Category> result = categoryService.page(itemPage,queryWrapper);
        PageVO<Category> objectPageDTO = new PageVO<>();
//        页面总数
        objectPageDTO.setTotal(result.getTotal());
//        列表数据
        objectPageDTO.setList(result.getRecords());
        return objectPageDTO;
    }
    //新增菜品分类
    @RequestMapping("/addCate")
   @ResponseBody
     public BaseResult addRestaurant(MultipartFile file, String cateName){
        BaseResult baseResult=BaseResult.successResult();
            Category category=new Category();
             System.out.println(cateName);
           category.setCateName(cateName);
           categoryService.insertNewCate(category);
          return baseResult;
     }


     //修改门店
     @RequestMapping("/updateCate")
   @ResponseBody
     public BaseResult updateRestaurant(int cateId,String cateName){
        BaseResult baseResult=BaseResult.successResult();
            System.out.println(cateId);

            System.out.println(cateName);
            Category category=new Category();
            category.setCateId(cateId);
            category.setCateName(cateName);
            categoryService.updateCate(category);
          return baseResult;
     }

//删除门店
    @RequestMapping("/deleteCate")
    @ResponseBody
     public BaseResult inputUser(int cateId){
         BaseResult baseResult=BaseResult.successResult();
      System.out.println(cateId);
        categoryService.deleteCate(cateId);
          return baseResult;
     }
}
