package com.superc.kimserver.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 *
 * @Author: superC
 * @Date: 2018/11/11 20:05
 */
@Entity(name = "user_info")
public class UserInfo implements Serializable {

    /**
     * id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 登录名
     * nullable 是否能传入null值
     * unique   约束唯一
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * 密码
     */
    @Column(nullable = false)
    private String password;

    /**
     * 姓名
     */
    private String realname;

    /**
     * 用户类型（0:女，1:男，2:保密）
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职业类型：
     * 1：Java开发
     * 2：前端开发
     * 3：大数据开发
     * 4：ios开发
     * 5：Android开发
     * 10：学生
     * 11：其它
     */
    private String job;

    /**
     * 头像url
     */
    private String facelImage;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 详细地址
     */
    private String address;

    private String openid;

    private String bn;

    private Date ts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFacelImage() {
        return facelImage;
    }

    public void setFacelImage(String facelImage) {
        this.facelImage = facelImage;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", facelImage='" + facelImage + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", openid='" + openid + '\'' +
                ", bn='" + bn + '\'' +
                ", ts=" + ts +
                '}';
    }


}
