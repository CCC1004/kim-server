package com.superc.kimserver.dao;

import com.superc.kimserver.domain.KimIndexRmtp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KimIndexRmtpDAO {
    int deleteByPrimaryKey(String guid);

    int insert(KimIndexRmtp record);

    int insertSelective(KimIndexRmtp record);

    KimIndexRmtp selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(KimIndexRmtp record);

    int updateByPrimaryKey(KimIndexRmtp record);

    /**
     * 获取列表
     */
    List<KimIndexRmtp> selectAll();
}