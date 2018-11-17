package com.superc.kimserver.domain;

import java.io.Serializable;
import java.util.Date;

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
     * 头像图片id(与资源信息主键匹配)
     */
    private String rmHeadImg;

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
        KimIndexRmtp other = (KimIndexRmtp) that;
        return (this.getGuid() == null ? other.getGuid() == null : this.getGuid().equals(other.getGuid()))
            && (this.getRmName() == null ? other.getRmName() == null : this.getRmName().equals(other.getRmName()))
            && (this.getRmImage() == null ? other.getRmImage() == null : this.getRmImage().equals(other.getRmImage()))
            && (this.getRmHeadImg() == null ? other.getRmHeadImg() == null : this.getRmHeadImg().equals(other.getRmHeadImg()))
            && (this.getRmTitle() == null ? other.getRmTitle() == null : this.getRmTitle().equals(other.getRmTitle()))
            && (this.getRmContext() == null ? other.getRmContext() == null : this.getRmContext().equals(other.getRmContext()))
            && (this.getRmSort() == null ? other.getRmSort() == null : this.getRmSort().equals(other.getRmSort()))
            && (this.getNt() == null ? other.getNt() == null : this.getNt().equals(other.getNt()))
            && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGuid() == null) ? 0 : getGuid().hashCode());
        result = prime * result + ((getRmName() == null) ? 0 : getRmName().hashCode());
        result = prime * result + ((getRmImage() == null) ? 0 : getRmImage().hashCode());
        result = prime * result + ((getRmHeadImg() == null) ? 0 : getRmHeadImg().hashCode());
        result = prime * result + ((getRmTitle() == null) ? 0 : getRmTitle().hashCode());
        result = prime * result + ((getRmContext() == null) ? 0 : getRmContext().hashCode());
        result = prime * result + ((getRmSort() == null) ? 0 : getRmSort().hashCode());
        result = prime * result + ((getNt() == null) ? 0 : getNt().hashCode());
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", guid=").append(guid);
        sb.append(", rmName=").append(rmName);
        sb.append(", rmImage=").append(rmImage);
        sb.append(", rmHeadImg=").append(rmHeadImg);
        sb.append(", rmTitle=").append(rmTitle);
        sb.append(", rmContext=").append(rmContext);
        sb.append(", rmSort=").append(rmSort);
        sb.append(", nt=").append(nt);
        sb.append(", ts=").append(ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}