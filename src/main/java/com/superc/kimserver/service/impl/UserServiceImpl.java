package com.superc.kimserver.service.impl;

import com.superc.kimserver.domain.UserInfo;
import com.superc.kimserver.repository.UserRepository;
import com.superc.kimserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: superC
 * @Date: 2018/11/13 23:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserInfo loginCheck(String username, String password) {

//        int count = userRepository.isExist(username);


        UserInfo user = userRepository.findByUsernameAndPassword(username, password);

        return user;
    }
}
