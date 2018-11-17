package com.superc.kimserver.dao;

import com.superc.kimserver.domain.KimResources;
import org.springframework.stereotype.Repository;

@Repository
public interface KimResourcesDAO {
    int deleteByPrimaryKey(String fileCd);

    int insert(KimResources record);

    int insertSelective(KimResources record);

    KimResources selectByPrimaryKey(String fileCd);

    int updateByPrimaryKeySelective(KimResources record);

    int updateByPrimaryKey(KimResources record);
}