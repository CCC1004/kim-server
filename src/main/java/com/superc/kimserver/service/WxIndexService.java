package com.superc.kimserver.service;

import com.superc.kimserver.domain.KimIndexJptj;
import com.superc.kimserver.domain.KimIndexLb;
import com.superc.kimserver.domain.KimIndexRmtp;

import java.util.List;

/**
 * @Author: superC
 * @Date: 2018/11/17 11:05
 */
public interface WxIndexService {

    /**
     * 获取轮播图列表
     * @return
     */
    List<KimIndexLb> getLbList();

    /**
     * 获取精品推荐列表
     */
    List<KimIndexJptj> getJptjList();

    /**
     * 获取热门图片列表
     */
    List<KimIndexRmtp> getRmtpList();

}
