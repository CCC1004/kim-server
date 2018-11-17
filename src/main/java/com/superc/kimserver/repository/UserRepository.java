package com.superc.kimserver.repository;

import com.superc.kimserver.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author: superC
 * @Date: 2018/11/13 23:04
 */
public interface UserRepository extends JpaRepository<UserInfo, Integer> {


    /**
     * 根据用户名、密码，获取用户信息
     * @param username
     * @param password
     * @return
     */
    @Query("select u from user_info u where u.username = ?1 and u.password = ?2")
    UserInfo findByUsernameAndPassword(String username, String password);
}
