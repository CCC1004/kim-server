package com.superc.kimserver.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * kim_index_rmtp
 * @author 
 */
public class KimIndexRmtp implements Serializable {
    /**
     * 主键自增
     */
    private String guid;

    /**
     * 热门名称
     */
    private String rmName;

    /**
     * 热门图片id(与资源信息主键匹配)
     */
    private String rmImage;

    /**
     * kim_index_rmtp表中有一个lb_image字段，所以在KimIndexRmtp类中定义一个imgResources属性，
     * 用于维护KimIndexRmtp和KimResources之间的一对一关系，
     * 轮播图片id(与资源信息主键匹配)
     */
    private KimResources imgResources;

    /**
     * 头像图片id(与资源信息主键匹配)
     */
    private String rmHeadImg;

    /**
     * kim_index_rmtp表中有一个lb_image字段，所以在KimIndexRmtp类中定义一个headResources属性，
     * 用于维护KimIndexRmtp和KimResources之间的一对一关系，
     * 轮播图片id(与资源信息主键匹配)
     */
    private KimResources headResources;

    /**
     * 标题
     */
    private String rmTitle;

    /**
     * 内容
     */
    private String rmContext;

    /**
     * 排序
     */
    private String rmSort;

    /**
     * 备注
     */
    private String nt;

    /**
     * 时间戳
     */
    private Date ts;

    private static final long serialVersionUID = 1L;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public String getRmImage() {
        return rmImage;
    }

    public void setRmImage(String rmImage) {
        this.rmImage = rmImage;
    }

    public String getRmHeadImg() {
        return rmHeadImg;
    }

    public void setRmHeadImg(String rmHeadImg) {
        this.rmHeadImg = rmHeadImg;
    }

    public String getRmTitle() {
        return rmTitle;
    }

    public void setRmTitle(String rmTitle) {
        this.rmTitle = rmTitle;
    }

    public String getRmContext() {
        return rmContext;
    }

    public void setRmContext(String rmContext) {
        this.rmContext = rmContext;
    }

    public String getRmSort() {
        return rmSort;
    }

    public void setRmSort(String rmSort) {
        this.rmSort = rmSort;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public KimResources getImgResources() {
        return imgResources;
    }

    public void setImgResources(KimResources imgResources) {
        this.imgResources = imgResources;
    }

    public KimResources getHeadResources() {
        return headResources;
    }

    public void setHeadResources(KimResources headResources) {
        this.headResources = headResources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KimIndexRmtp that = (KimIndexRmtp) o;
        return Objects.equals(guid, that.guid) &&
                Objects.equals(rmName, that.rmName) &&
                Objects.equals(rmImage, that.rmImage) &&
                Objects.equals(imgResources, that.imgResources) &&
                Objects.equals(rmHeadImg, that.rmHeadImg) &&
                Objects.equals(headResources, that.headResources) &&
                Objects.equals(rmTitle, that.rmTitle) &&
                Objects.equals(rmContext, that.rmContext) &&
                Objects.equals(rmSort, that.rmSort) &&
                Objects.equals(nt, that.nt) &&
                Objects.equals(ts, that.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, rmName, rmImage, imgResources, rmHeadImg, headResources, rmTitle, rmContext, rmSort, nt, ts);
    }

    @Override
    public String toString() {
        return "KimIndexRmtp{" +
                "guid='" + guid + '\'' +
                ", rmName='" + rmName + '\'' +
                ", rmImage='" + rmImage + '\'' +
                ", imgResources=" + imgResources +
                ", rmHeadImg='" + rmHeadImg + '\'' +
                ", headResources=" + headResources +
                ", rmTitle='" + rmTitle + '\'' +
                ", rmContext='" + rmContext + '\'' +
                ", rmSort='" + rmSort + '\'' +
                ", nt='" + nt + '\'' +
                ", ts=" + ts +
                '}';
    }
}