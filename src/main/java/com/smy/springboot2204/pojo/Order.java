package com.smy.springboot2204.pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer orderId;

    private String orderNo;

    private String orderCreatetime;

    private Integer orderPrice;

    private String orderAddress;

    private String orderReview;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(String orderCreatetime) {
        this.orderCreatetime = orderCreatetime == null ? null : orderCreatetime.trim();
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public String getOrderReview() {
        return orderReview;
    }

    public void setOrderReview(String orderReview) {
        this.orderReview = orderReview == null ? null : orderReview.trim();
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getOrderCreatetime() == null ? other.getOrderCreatetime() == null : this.getOrderCreatetime().equals(other.getOrderCreatetime()))
            && (this.getOrderPrice() == null ? other.getOrderPrice() == null : this.getOrderPrice().equals(other.getOrderPrice()))
            && (this.getOrderAddress() == null ? other.getOrderAddress() == null : this.getOrderAddress().equals(other.getOrderAddress()))
            && (this.getOrderReview() == null ? other.getOrderReview() == null : this.getOrderReview().equals(other.getOrderReview()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getOrderCreatetime() == null) ? 0 : getOrderCreatetime().hashCode());
        result = prime * result + ((getOrderPrice() == null) ? 0 : getOrderPrice().hashCode());
        result = prime * result + ((getOrderAddress() == null) ? 0 : getOrderAddress().hashCode());
        result = prime * result + ((getOrderReview() == null) ? 0 : getOrderReview().hashCode());
        return result;
    }
}