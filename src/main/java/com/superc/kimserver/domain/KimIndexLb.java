package com.superc.kimserver.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * kim_index_lb
 * @author 
 */
public class KimIndexLb implements Serializable {
    /**
     * 主键自增
     */
    private String guid;

    /**
     * 轮播页名称
     */
    private String lbName;

    /**
     * kim_index_lb表中有一个lb_image字段，所以在KimIndexLb类中定义一个kimResources属性，
     * 用于维护KimIndexLb和KimResources之间的一对一关系，
     * 轮播图片id(与资源信息主键匹配)
     */
     private KimResources kimResources;


    /**
     * 排序
     */
    private String lbSort;

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

    public String getLbName() {
        return lbName;
    }

    public void setLbName(String lbName) {
        this.lbName = lbName;
    }

    public KimResources getKimResources() {
        return kimResources;
    }

    public void setKimResources(KimResources kimResources) {
        this.kimResources = kimResources;
    }

    public String getLbSort() {
        return lbSort;
    }

    public void setLbSort(String lbSort) {
        this.lbSort = lbSort;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KimIndexLb that = (KimIndexLb) o;
        return Objects.equals(guid, that.guid) &&
                Objects.equals(lbName, that.lbName) &&
                Objects.equals(kimResources, that.kimResources) &&
                Objects.equals(lbSort, that.lbSort) &&
                Objects.equals(nt, that.nt) &&
                Objects.equals(ts, that.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, lbName, kimResources, lbSort, nt, ts);
    }

    @Override
    public String toString() {
        return "KimIndexLb{" +
                "guid='" + guid + '\'' +
                ", lbName='" + lbName + '\'' +
                ", kimResources=" + kimResources +
                ", lbSort='" + lbSort + '\'' +
                ", nt='" + nt + '\'' +
                ", ts=" + ts +
                '}';
    }
}