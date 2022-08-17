package com.smy.springboot2204.pojo;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer addId;

    private Integer userId;

    private String addAdress;

    private String addPhone;

    private static final long serialVersionUID = 1L;

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddAdress() {
        return addAdress;
    }

    public void setAddAdress(String addAdress) {
        this.addAdress = addAdress == null ? null : addAdress.trim();
    }

    public String getAddPhone() {
        return addPhone;
    }

    public void setAddPhone(String addPhone) {
        this.addPhone = addPhone == null ? null : addPhone.trim();
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
        Address other = (Address) that;
        return (this.getAddId() == null ? other.getAddId() == null : this.getAddId().equals(other.getAddId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAddAdress() == null ? other.getAddAdress() == null : this.getAddAdress().equals(other.getAddAdress()))
            && (this.getAddPhone() == null ? other.getAddPhone() == null : this.getAddPhone().equals(other.getAddPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddId() == null) ? 0 : getAddId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAddAdress() == null) ? 0 : getAddAdress().hashCode());
        result = prime * result + ((getAddPhone() == null) ? 0 : getAddPhone().hashCode());
        return result;
    }
}