package com.smy.springboot2204.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.smy.springboot2204.dto.BaseResult;
import com.smy.springboot2204.dto.PageVO;
import com.smy.springboot2204.pojo.Restaurant;
import com.smy.springboot2204.pojo.User;
import com.smy.springboot2204.service.UserService;
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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@CrossOrigin
@RequestMapping("/admin")
public class UserController {
        @Autowired
    private UserService userService;

         //分页查询所有用户
 @RequestMapping("/userList")
    @ResponseBody
    public PageVO page(@RequestParam(value = "page") int page,
                       @RequestParam(value = "size") int size,
                       String search) {
        Page<User> itemPage = new Page<>(page, size);
        LambdaQueryWrapper<User> queryWrapper= new LambdaQueryWrapper<>();
//        非空-模糊查询
        if (search!=null && search!=""){
//            这里是模糊查询like方法，like方法第一个参数为表映射类的字段，
//            为哪个字段进行查询，第二个参数为具体数据；
            queryWrapper.like(User::getUserName,search);
        }
        Page<User> result = userService.page(itemPage,queryWrapper);
        PageVO<User> objectPageDTO = new PageVO<>();
//        页面总数
        objectPageDTO.setTotal(result.getTotal());
//        列表数据
        objectPageDTO.setList(result.getRecords());

        return objectPageDTO;
    }

//删除用户
    @RequestMapping("/deleteUser")
    @ResponseBody
     public BaseResult inputUser(int userId){
         BaseResult baseResult=BaseResult.successResult();
      System.out.println(userId);
        userService.deleteUser(userId);
          return baseResult;
     }


     //新增门店
         @RequestMapping("/addUser")
   @ResponseBody
     public BaseResult addRestaurant( String userName, String userPass, String userPhone, String userPic,String userMail,int userSex,int userRoleid){
            User user=new User();
             System.out.println(userName);
             System.out.println(userPass);
             System.out.println(userPhone);
             System.out.println(userMail);
             System.out.println(userSex);
             System.out.println(userRoleid);
              user.setUserPic(userPic);
              user.setUserName(userName);
              user.setUserPass(userPass);
              user.setUserMail(userMail);
              user.setUserSex(userSex);
              user.setUserPhone(userPhone);
              user.setUserRoleid(userRoleid);
             User user1=userService.selectByName(userName);
             System.out.println(user1);
             if (user1 == null) {
                userService.insertNewUser(user);
                return BaseResult.successResult();
             }else {
                 return BaseResult.failResult();
             }
     }

     //修改门店
     @RequestMapping("/updateUser")
   @ResponseBody
     public BaseResult updateRestaurant(int userId,String userName, String userPass, String userPhone, String userPic,String userMail,int userSex,int userRoleid){
//        BaseResult baseResult=BaseResult.successResult();
            System.out.println(userId);
            System.out.println(userName);
            System.out.println(userPass);
            System.out.println(userPhone);
            System.out.println(userPic);
            System.out.println(userMail);
            System.out.println(userSex);
            System.out.println(userRoleid);
            User user=new User();
            user.setUserId(userId);
            user.setUserName(userName);
            user.setUserPass(userPass);
            user.setUserPhone(userPhone);
            user.setUserPic(userPic);
            user.setUserMail(userMail);
            user.setUserSex(userSex);
            user.setUserRoleid(userRoleid);
            User user1=userService.selectByName(userName);
            User user2=userService.selectById(userId);
             if(user1==null||user2.getUserName().equals(userName)) {
                 userService.updateUser(user);
                   return BaseResult.successResult();
             }else {
                 return BaseResult.failResult();
             }
     }


//上传文件
     @RequestMapping("/fileUploadUser")
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
  @RequestMapping("/findPicUser")
    @ResponseBody
    public BaseResult findPic(String userId,String userPic){

        BaseResult baseResult=BaseResult.successResult();
        System.out.println(userId);
        System.out.println(userPic);
         System.out.println("添加成功" );
         int i = Integer.parseInt(userId);
         userService.updatePhoto(i,userPic);
          Map map = new HashMap<>();
            map.put("photo",userPic);
             baseResult.setData(map);
        return baseResult;
    }

}