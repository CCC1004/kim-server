package com.superc.kimserver.dao;

import com.superc.kimserver.domain.KimIndexLb;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KimIndexLbDAO {
    int deleteByPrimaryKey(String guid);

    int insert(KimIndexLb record);

    int insertSelective(KimIndexLb record);

    KimIndexLb selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(KimIndexLb record);

    int updateByPrimaryKey(KimIndexLb record);

    /**
     * 获取列表
     */
    List<KimIndexLb> selectAll();
}