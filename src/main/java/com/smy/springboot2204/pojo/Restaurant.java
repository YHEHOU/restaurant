package com.smy.springboot2204.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
@TableName("tbl_restaurant")
public class Restaurant implements Serializable {
//    @TableId(value ="rest_id", type = IdType.ID_WORKER_STR)
    private Integer restId;
//    @TableField("rest_name")
    private String restName;
//    @TableField("rest_address")
    private String restAddress;
//    @TableField("rest_phone")
    private String restPhone;
//    @TableField("rest_photo")
    private String restPhoto;
//    @TableField("rest_info")
    private String restInfo;

    private static final long serialVersionUID = 1L;

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName == null ? null : restName.trim();
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress == null ? null : restAddress.trim();
    }

    public String getRestPhone() {
        return restPhone;
    }

    public void setRestPhone(String restPhone) {
        this.restPhone = restPhone == null ? null : restPhone.trim();
    }

    public String getRestPhoto() {
        return restPhoto;
    }

    public void setRestPhoto(String restPhoto) {
        this.restPhoto = restPhoto == null ? null : restPhoto.trim();
    }

    public String getRestInfo() {
        return restInfo;
    }

    public void setRestInfo(String restInfo) {
        this.restInfo = restInfo == null ? null : restInfo.trim();
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
        Restaurant other = (Restaurant) that;
        return (this.getRestId() == null ? other.getRestId() == null : this.getRestId().equals(other.getRestId()))
            && (this.getRestName() == null ? other.getRestName() == null : this.getRestName().equals(other.getRestName()))
            && (this.getRestAddress() == null ? other.getRestAddress() == null : this.getRestAddress().equals(other.getRestAddress()))
            && (this.getRestPhone() == null ? other.getRestPhone() == null : this.getRestPhone().equals(other.getRestPhone()))
            && (this.getRestPhoto() == null ? other.getRestPhoto() == null : this.getRestPhoto().equals(other.getRestPhoto()))
            && (this.getRestInfo() == null ? other.getRestInfo() == null : this.getRestInfo().equals(other.getRestInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRestId() == null) ? 0 : getRestId().hashCode());
        result = prime * result + ((getRestName() == null) ? 0 : getRestName().hashCode());
        result = prime * result + ((getRestAddress() == null) ? 0 : getRestAddress().hashCode());
        result = prime * result + ((getRestPhone() == null) ? 0 : getRestPhone().hashCode());
        result = prime * result + ((getRestPhoto() == null) ? 0 : getRestPhoto().hashCode());
        result = prime * result + ((getRestInfo() == null) ? 0 : getRestInfo().hashCode());
        return result;
    }
}