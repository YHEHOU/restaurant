package com.smy.springboot2204.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
@TableName("tbl_category")
public class Category implements Serializable {
    private Integer cateId;

    private String cateName;

    private String catePageName;

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCatePageName() {
        return catePageName;
    }

    public void setCatePageName(String catePageName) {
        this.catePageName = catePageName == null ? null : catePageName.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Category other = (Category) that;
        return (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getCateName() == null ? other.getCateName() == null : this.getCateName().equals(other.getCateName()))
            && (this.getCatePageName() == null ? other.getCatePageName() == null : this.getCatePageName().equals(other.getCatePageName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getCateName() == null) ? 0 : getCateName().hashCode());
        result = prime * result + ((getCatePageName() == null) ? 0 : getCatePageName().hashCode());
        return result;
    }
}