package com.smy.springboot2204.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
@TableName("tbl_user")
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPass;

    private Integer userRoleid;

    private String userPhone;

    private Integer userSex;

    private String userPic;

    private String userMail;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public Integer getUserRoleid() {
        return userRoleid;
    }

    public void setUserRoleid(Integer userRoleid) {
        this.userRoleid = userRoleid;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPass() == null ? other.getUserPass() == null : this.getUserPass().equals(other.getUserPass()))
            && (this.getUserRoleid() == null ? other.getUserRoleid() == null : this.getUserRoleid().equals(other.getUserRoleid()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserPic() == null ? other.getUserPic() == null : this.getUserPic().equals(other.getUserPic()))
            && (this.getUserMail() == null ? other.getUserMail() == null : this.getUserMail().equals(other.getUserMail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPass() == null) ? 0 : getUserPass().hashCode());
        result = prime * result + ((getUserRoleid() == null) ? 0 : getUserRoleid().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserPic() == null) ? 0 : getUserPic().hashCode());
        result = prime * result + ((getUserMail() == null) ? 0 : getUserMail().hashCode());
        return result;
    }
}