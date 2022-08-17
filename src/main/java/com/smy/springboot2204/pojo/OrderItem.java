package com.smy.springboot2204.pojo;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private Integer itemId;

    private Integer orderId;

    private Integer proId;

    private Integer itemNum;

    private Integer userId;

    private Integer restId;

    private String itemState;

    private static final long serialVersionUID = 1L;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState == null ? null : itemState.trim();
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
        OrderItem other = (OrderItem) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getItemNum() == null ? other.getItemNum() == null : this.getItemNum().equals(other.getItemNum()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRestId() == null ? other.getRestId() == null : this.getRestId().equals(other.getRestId()))
            && (this.getItemState() == null ? other.getItemState() == null : this.getItemState().equals(other.getItemState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getItemNum() == null) ? 0 : getItemNum().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRestId() == null) ? 0 : getRestId().hashCode());
        result = prime * result + ((getItemState() == null) ? 0 : getItemState().hashCode());
        return result;
    }
}