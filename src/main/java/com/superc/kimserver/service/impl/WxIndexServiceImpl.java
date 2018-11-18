package com.superc.kimserver.service.impl;

import com.superc.kimserver.dao.KimIndexJptjDAO;
import com.superc.kimserver.dao.KimIndexLbDAO;
import com.superc.kimserver.dao.KimIndexRmtpDAO;
import com.superc.kimserver.domain.KimIndexJptj;
import com.superc.kimserver.domain.KimIndexLb;
import com.superc.kimserver.domain.KimIndexRmtp;
import com.superc.kimserver.service.WxIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: superC
 * @Date: 2018/11/17 11:06
 */
@Service
public class WxIndexServiceImpl implements WxIndexService {


    @Autowired
    KimIndexLbDAO kimIndexLbDAO;

    @Autowired
    KimIndexJptjDAO kimIndexJptjDAO;

    @Autowired
    KimIndexRmtpDAO kimIndexRmtpDAO;


    /**
     * 获取轮播图列表
     * @return
     */
    @Override
    public List<KimIndexLb> getLbList() {

        List<KimIndexLb> list = kimIndexLbDAO.selectAll();
        return list;
    }

    /**
     * 获取精品推荐列表
     */
    @Override
    public List<KimIndexJptj> getJptjList() {
        List<KimIndexJptj> list = kimIndexJptjDAO.selectAll();
        return list;
    }

    /**
     * 获取热门图片列表
     */
    @Override
    public List<KimIndexRmtp> getRmtpList() {
        List<KimIndexRmtp> list = kimIndexRmtpDAO.selectAll();
        return list;
    }
}
