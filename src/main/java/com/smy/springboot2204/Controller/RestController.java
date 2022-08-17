package com.smy.springboot2204.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smy.springboot2204.dto.BaseResult;
import com.smy.springboot2204.dto.PageVO;
import com.smy.springboot2204.pojo.Order;
import com.smy.springboot2204.pojo.Restaurant;
import com.smy.springboot2204.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;

@Controller
@CrossOrigin
@RequestMapping("/admin")
public class RestController {

    @Autowired
    private RestaurantService restaurantService;
//修改门店
     @RequestMapping("/updateRestaurant")
   @ResponseBody
     public BaseResult updateRestaurant(int restId,String restName,String restAddress,String restPhone,String restPhoto,String restInfo){
        BaseResult baseResult=BaseResult.successResult();
            System.out.println(restId);
            System.out.println(restAddress);
            System.out.println(restName);
            System.out.println(restPhone);
            System.out.println(restPhoto);
            System.out.println(restInfo);
            Restaurant restaurant=new Restaurant();
            restaurant.setRestId(restId);
            restaurant.setRestName(restName);
            restaurant.setRestAddress(restAddress);
            restaurant.setRestPhone(restPhone);
            restaurant.setRestPhoto(restPhoto);
            restaurant.setRestInfo(restInfo);
            restaurantService.updateRest(restaurant);
          return baseResult;
     }
//删除门店
    @RequestMapping("/deleteRestaurant")
    @ResponseBody
     public BaseResult inputUser(int restId){
         BaseResult baseResult=BaseResult.successResult();
      System.out.println(restId);
        restaurantService.deleteRest(restId);
          return baseResult;
     }


//新增门店
         @RequestMapping("/addRestaurant")
   @ResponseBody
     public BaseResult addRestaurant(MultipartFile file,String restName,String restAddress,String restPhoto,String restPhone,String restInfo){
        BaseResult baseResult=BaseResult.successResult();
            Restaurant restaurant=new Restaurant();
             System.out.println(restName);
             System.out.println(restAddress);
             System.out.println(restPhone);
             System.out.println(restPhoto);
             System.out.println(restInfo);

            restaurant.setRestName(restName);
            restaurant.setRestAddress(restAddress);
            restaurant.setRestPhone(restPhone);
            restaurant.setRestPhoto(restPhoto);
            restaurant.setRestInfo(restInfo);
            restaurantService.insertNewRest(restaurant);
          return baseResult;
     }
//上传文件
     @RequestMapping("/fileUpload")
    @ResponseBody
    public BaseResult upload(MultipartFile file, HttpServletRequest request){
//        log.info("call FileUploadController upload method...");
        BaseResult baseResult=BaseResult.successResult();
        // 1-定义上传的位置
//        String uploadPath="D:\\upload\\";
        String uploadPath="D:\\东方睿智\\项目\\三阶段项目\\fandian\\myproject1\\src\\assets";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
//        String currentDate=sdf.format(new Date());
        //上传的目录
        File folder=new File(uploadPath);
        if(!folder.isDirectory()){
            //如果没有目录则创建
            folder.mkdirs();
        }
        //获取文件名
        String sourceFileName=file.getOriginalFilename();
        //上传的文件增加随机串(不增加的话，新上传的文件会把原来的文件覆盖掉)
        String newFileName= UUID.randomUUID().toString()+sourceFileName;
//        log.debug(newFileName);
        //上传文件
        try {
            file.transferTo(new File(folder,newFileName));
            Map map = new HashMap<>();
            map.put("fileName",newFileName);
            baseResult.setData(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baseResult;
    }
    //更新图片
  @RequestMapping("/findPic")
    @ResponseBody
    public BaseResult findPic(String restId,String restPhoto){

        BaseResult baseResult=BaseResult.successResult();
        System.out.println(restId);
        System.out.println(restPhoto);
         System.out.println("添加成功" );
         int i = Integer.parseInt(restId);
         restaurantService.updatePhoto(i,restPhoto);
          Map map = new HashMap<>();
            map.put("photo",restPhoto);
             baseResult.setData(map);
        return baseResult;
    }



//分页查询所有门店
 @RequestMapping("/list")
    @ResponseBody
    public PageVO page(@RequestParam(value = "page") int page,
                       @RequestParam(value = "size") int size,
                       String search) {
        Page<Restaurant> itemPage = new Page<>(page, size);
        LambdaQueryWrapper<Restaurant> queryWrapper= new LambdaQueryWrapper<>();
//        非空-模糊查询
        if (search!=null && search!=""){
//            这里是模糊查询like方法，like方法第一个参数为表映射类的字段，
//            为哪个字段进行查询，第二个参数为具体数据；
            queryWrapper.like(Restaurant::getRestName,search);
        }
        Page<Restaurant> result = restaurantService.page(itemPage,queryWrapper);
        PageVO<Restaurant> objectPageDTO = new PageVO<>();
//        页面总数
        objectPageDTO.setTotal(result.getTotal());
//        列表数据
        objectPageDTO.setList(result.getRecords());

        return objectPageDTO;
    }

//查询tbl_order
         @RequestMapping("/findOrderList")
   @ResponseBody
     public BaseResult findOrderList(int restId){
        BaseResult baseResult=BaseResult.successResult();
        List<Order> orderList=restaurantService.selectOrderByName(restId);
            Map map=new HashMap<>();
            map.put("list",orderList);
            baseResult.setData(map);
          return baseResult;
     }
}
