package com.superc.kimserver.dao;

import com.superc.kimserver.domain.KimIndexJptj;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KimIndexJptjDAO {
    int deleteByPrimaryKey(String guid);

    int insert(KimIndexJptj record);

    int insertSelective(KimIndexJptj record);

    KimIndexJptj selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(KimIndexJptj record);

    int updateByPrimaryKey(KimIndexJptj record);

    /**
     * 获取列表
     */
    List<KimIndexJptj> selectAll();
}