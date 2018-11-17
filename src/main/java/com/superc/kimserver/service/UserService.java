package com.superc.kimserver.service;

import com.superc.kimserver.domain.UserInfo;

/**
 * @Author: superC
 * @Date: 2018/11/13 23:18
 */
public interface UserService {
    UserInfo loginCheck(String username, String password);
}
