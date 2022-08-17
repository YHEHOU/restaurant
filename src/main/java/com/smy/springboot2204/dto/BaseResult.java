package com.smy.springboot2204.dto;
//import com.smy.constants.ResultCodeEnum;

import com.smy.springboot2204.constants.ResultCodeEnum;
import lombok.Data;

import java.util.Map;

@Data
public class BaseResult {
    //    响应结果标志位,标志着该接口是否操作成功
    private Boolean success;

//    响应状态码 code的结果  0000
    private Integer code;

//    状态码描述 "操作成功"
    private String message;

//    如果要适配更多的类型  常见  Map JsonObject String(json)
    private Map<String, Object> data;



    //    通用返回成功
    public static  BaseResult successResult(){
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        baseResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        baseResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return baseResult;
    }

    // 通用返回失败
    public static BaseResult failResult() {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(ResultCodeEnum.FAILURE.getSuccess());
        baseResult.setCode(ResultCodeEnum.FAILURE.getCode());
        baseResult.setMessage(ResultCodeEnum.FAILURE.getMessage());
        return baseResult;
    }

//    // 通用返回异常
//    public static BaseResult exceptionResult() {
//        BaseResult baseResult = new BaseResult();
//        baseResult.setSuccess(ResultCodeEnum.SYSTEM_ERROR.getSuccess());
//        baseResult.setCode(ResultCodeEnum.SYSTEM_ERROR.getCode());
//        baseResult.setMessage(ResultCodeEnum.SYSTEM_ERROR.getMessage());
//        return baseResult;
//    }

    // 设置结果，形参为结果枚举+数据域
    public static BaseResult setResult(ResultCodeEnum result,Map<String,Object> data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setSuccess(result.getSuccess());
        baseResult.setCode(result.getCode());
        baseResult.setMessage(result.getMessage());
        baseResult.setData(data);
        return baseResult;
    }
}
