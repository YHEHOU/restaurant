package com.smy.springboot2204.constants;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SUCCESS(true,0000,"操作成功"),
    FAILURE(false,0001,"操作失败"),
    PARAM_ERROR(false,0002,"参数缺失"),
    USER_NOTLOGIN(false,1000,"用户未登录"),
    USER_UNAUTHORIZED(false,1001,"权限不足"),
//    SYSTEM_ERROR(false,1011,"系统错误")
    ;

    //    响应结果标志位,标志着该接口是否操作成功
    private Boolean success;

    //    响应状态码 code的结果  0000
    private Integer code;

    //    状态码描述 "操作成功"
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}