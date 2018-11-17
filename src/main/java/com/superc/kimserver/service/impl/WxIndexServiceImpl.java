package com.superc.kimserver.service.impl;

import com.superc.kimserver.dao.KimIndexLbDAO;
import com.superc.kimserver.domain.KimIndexLb;
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

    /**
     * 获取轮播图列表
     * @return
     */
    @Override
    public List<KimIndexLb> getLbList() {

        List<KimIndexLb> list = kimIndexLbDAO.selectAll();
        return list;
    }
}
