package com.smy.springboot2204.pojo;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Integer proId;

    private String proName;

    private Integer proPrice;

    private Integer proSalenum;

    private String proPhoto;

    private String proInfo;

    private Date proCreatetime;

    private Integer categoryId;

    private Integer restId;

    private Integer proCost;

    private static final long serialVersionUID = 1L;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProPrice() {
        return proPrice;
    }

    public void setProPrice(Integer proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProSalenum() {
        return proSalenum;
    }

    public void setProSalenum(Integer proSalenum) {
        this.proSalenum = proSalenum;
    }

    public String getProPhoto() {
        return proPhoto;
    }

    public void setProPhoto(String proPhoto) {
        this.proPhoto = proPhoto == null ? null : proPhoto.trim();
    }

    public String getProInfo() {
        return proInfo;
    }

    public void setProInfo(String proInfo) {
        this.proInfo = proInfo == null ? null : proInfo.trim();
    }

    public Date getProCreatetime() {
        return proCreatetime;
    }

    public void setProCreatetime(Date proCreatetime) {
        this.proCreatetime = proCreatetime;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public Integer getProCost() {
        return proCost;
    }

    public void setProCost(Integer proCost) {
        this.proCost = proCost;
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
        Product other = (Product) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProPrice() == null ? other.getProPrice() == null : this.getProPrice().equals(other.getProPrice()))
            && (this.getProSalenum() == null ? other.getProSalenum() == null : this.getProSalenum().equals(other.getProSalenum()))
            && (this.getProPhoto() == null ? other.getProPhoto() == null : this.getProPhoto().equals(other.getProPhoto()))
            && (this.getProInfo() == null ? other.getProInfo() == null : this.getProInfo().equals(other.getProInfo()))
            && (this.getProCreatetime() == null ? other.getProCreatetime() == null : this.getProCreatetime().equals(other.getProCreatetime()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getRestId() == null ? other.getRestId() == null : this.getRestId().equals(other.getRestId()))
            && (this.getProCost() == null ? other.getProCost() == null : this.getProCost().equals(other.getProCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProPrice() == null) ? 0 : getProPrice().hashCode());
        result = prime * result + ((getProSalenum() == null) ? 0 : getProSalenum().hashCode());
        result = prime * result + ((getProPhoto() == null) ? 0 : getProPhoto().hashCode());
        result = prime * result + ((getProInfo() == null) ? 0 : getProInfo().hashCode());
        result = prime * result + ((getProCreatetime() == null) ? 0 : getProCreatetime().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getRestId() == null) ? 0 : getRestId().hashCode());
        result = prime * result + ((getProCost() == null) ? 0 : getProCost().hashCode());
        return result;
    }
}