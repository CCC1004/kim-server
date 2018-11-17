package com.superc.kimserver.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * kim_index_jptj
 * @author 
 */
public class KimIndexJptj implements Serializable {
    /**
     * 主键自增
     */
    private String guid;

    /**
     * 精品名称
     */
    private String jpName;

    /**
     * 精品图片id(与资源信息主键匹配)
     */
    private String jpImage;

    /**
     * 精品描述
     */
    private String jpDesc;

    /**
     * 排序
     */
    private String jpSort;

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

    public String getJpName() {
        return jpName;
    }

    public void setJpName(String jpName) {
        this.jpName = jpName;
    }

    public String getJpImage() {
        return jpImage;
    }

    public void setJpImage(String jpImage) {
        this.jpImage = jpImage;
    }

    public String getJpDesc() {
        return jpDesc;
    }

    public void setJpDesc(String jpDesc) {
        this.jpDesc = jpDesc;
    }

    public String getJpSort() {
        return jpSort;
    }

    public void setJpSort(String jpSort) {
        this.jpSort = jpSort;
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
        KimIndexJptj other = (KimIndexJptj) that;
        return (this.getGuid() == null ? other.getGuid() == null : this.getGuid().equals(other.getGuid()))
            && (this.getJpName() == null ? other.getJpName() == null : this.getJpName().equals(other.getJpName()))
            && (this.getJpImage() == null ? other.getJpImage() == null : this.getJpImage().equals(other.getJpImage()))
            && (this.getJpDesc() == null ? other.getJpDesc() == null : this.getJpDesc().equals(other.getJpDesc()))
            && (this.getJpSort() == null ? other.getJpSort() == null : this.getJpSort().equals(other.getJpSort()))
            && (this.getNt() == null ? other.getNt() == null : this.getNt().equals(other.getNt()))
            && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGuid() == null) ? 0 : getGuid().hashCode());
        result = prime * result + ((getJpName() == null) ? 0 : getJpName().hashCode());
        result = prime * result + ((getJpImage() == null) ? 0 : getJpImage().hashCode());
        result = prime * result + ((getJpDesc() == null) ? 0 : getJpDesc().hashCode());
        result = prime * result + ((getJpSort() == null) ? 0 : getJpSort().hashCode());
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
        sb.append(", jpName=").append(jpName);
        sb.append(", jpImage=").append(jpImage);
        sb.append(", jpDesc=").append(jpDesc);
        sb.append(", jpSort=").append(jpSort);
        sb.append(", nt=").append(nt);
        sb.append(", ts=").append(ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}