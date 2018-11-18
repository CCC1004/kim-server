package com.superc.kimserver.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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
     * kim_index_jptj表中有一个lb_image字段，所以在KimIndexJptj类中定义一个kimResources属性，
     * 用于维护KimIndexJptj和KimResources之间的一对一关系，
     * 轮播图片id(与资源信息主键匹配)
     */
    private KimResources kimResources;

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

    public KimResources getKimResources() {
        return kimResources;
    }

    public void setKimResources(KimResources kimResources) {
        this.kimResources = kimResources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KimIndexJptj that = (KimIndexJptj) o;
        return Objects.equals(guid, that.guid) &&
                Objects.equals(jpName, that.jpName) &&
                Objects.equals(jpImage, that.jpImage) &&
                Objects.equals(kimResources, that.kimResources) &&
                Objects.equals(jpDesc, that.jpDesc) &&
                Objects.equals(jpSort, that.jpSort) &&
                Objects.equals(nt, that.nt) &&
                Objects.equals(ts, that.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, jpName, jpImage, kimResources, jpDesc, jpSort, nt, ts);
    }

    @Override
    public String toString() {
        return "KimIndexJptj{" +
                "guid='" + guid + '\'' +
                ", jpName='" + jpName + '\'' +
                ", jpImage='" + jpImage + '\'' +
                ", kimResources=" + kimResources +
                ", jpDesc='" + jpDesc + '\'' +
                ", jpSort='" + jpSort + '\'' +
                ", nt='" + nt + '\'' +
                ", ts=" + ts +
                '}';
    }
}