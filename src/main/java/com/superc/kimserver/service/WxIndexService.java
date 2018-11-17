package com.superc.kimserver.service;

import com.superc.kimserver.domain.KimIndexLb;

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
}
