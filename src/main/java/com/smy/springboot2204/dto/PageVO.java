package com.smy.springboot2204.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


//统一列表查询返回结果
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVO<T> {
//    操作结果
    private Integer code;
    /**
     * 总条数
     */
    private Long total;
    /**
     * 当前页数据
     */
    private List<T> list;
}