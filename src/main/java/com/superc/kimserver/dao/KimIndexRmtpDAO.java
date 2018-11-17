package com.superc.kimserver.dao;

import com.superc.kimserver.domain.KimIndexRmtp;
import org.springframework.stereotype.Repository;

@Repository
public interface KimIndexRmtpDAO {
    int deleteByPrimaryKey(String guid);

    int insert(KimIndexRmtp record);

    int insertSelective(KimIndexRmtp record);

    KimIndexRmtp selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(KimIndexRmtp record);

    int updateByPrimaryKey(KimIndexRmtp record);
}