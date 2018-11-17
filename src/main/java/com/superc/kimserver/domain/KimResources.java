package com.superc.kimserver.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * kim_resources
 * @author 
 */
public class KimResources implements Serializable {
    /**
     * 文件代码
     */
    private String fileCd;

    /**
     * 文件标题
     */
    private String fileTitl;

    /**
     * 关键词
     */
    private String keyWord;

    /**
     * 编制单位名称
     */
    private String estOrg;

    /**
     * 编制单位代码
     */
    private String orgcd;

    /**
     * 编制人员
     */
    private String estPers;

    /**
     * 编制完成日期
     */
    private Date estDt;

    /**
     * 发布单位名称
     */
    private String pubOrg;

    /**
     * 发布单位代码
     */
    private String pubOrgcd;

    /**
     * 发布日期
     */
    private Date pubDt;

    /**
     * 摘要信息
     */
    private String abs;

    /**
     * 多媒体文件类型（1文档资料；2图片资料；3视音资料；4其他文件）
     */
    private String mulTp;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件名
     */
    private String fileNm;

    /**
     * 文件大小
     */
    private BigDecimal fileSize;

    /**
     * 文件扩展名
     */
    private String fileExt;

    /**
     * 是否密件
     */
    private Boolean isSec;

    /**
     * 密件等级（1：公开级 2：限制级 3：秘密级 4：机密级 5：绝密级）
     */
    private String secG;

    /**
     * 资料类别
     */
    private String docTp;

    /**
     * 时间戳
     */
    private Date ts;

    /**
     * 备注
     */
    private String nt;

    private static final long serialVersionUID = 1L;

    public String getFileCd() {
        return fileCd;
    }

    public void setFileCd(String fileCd) {
        this.fileCd = fileCd;
    }

    public String getFileTitl() {
        return fileTitl;
    }

    public void setFileTitl(String fileTitl) {
        this.fileTitl = fileTitl;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getEstOrg() {
        return estOrg;
    }

    public void setEstOrg(String estOrg) {
        this.estOrg = estOrg;
    }

    public String getOrgcd() {
        return orgcd;
    }

    public void setOrgcd(String orgcd) {
        this.orgcd = orgcd;
    }

    public String getEstPers() {
        return estPers;
    }

    public void setEstPers(String estPers) {
        this.estPers = estPers;
    }

    public Date getEstDt() {
        return estDt;
    }

    public void setEstDt(Date estDt) {
        this.estDt = estDt;
    }

    public String getPubOrg() {
        return pubOrg;
    }

    public void setPubOrg(String pubOrg) {
        this.pubOrg = pubOrg;
    }

    public String getPubOrgcd() {
        return pubOrgcd;
    }

    public void setPubOrgcd(String pubOrgcd) {
        this.pubOrgcd = pubOrgcd;
    }

    public Date getPubDt() {
        return pubDt;
    }

    public void setPubDt(Date pubDt) {
        this.pubDt = pubDt;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getMulTp() {
        return mulTp;
    }

    public void setMulTp(String mulTp) {
        this.mulTp = mulTp;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileNm() {
        return fileNm;
    }

    public void setFileNm(String fileNm) {
        this.fileNm = fileNm;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public Boolean getIsSec() {
        return isSec;
    }

    public void setIsSec(Boolean isSec) {
        this.isSec = isSec;
    }

    public String getSecG() {
        return secG;
    }

    public void setSecG(String secG) {
        this.secG = secG;
    }

    public String getDocTp() {
        return docTp;
    }

    public void setDocTp(String docTp) {
        this.docTp = docTp;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }
}