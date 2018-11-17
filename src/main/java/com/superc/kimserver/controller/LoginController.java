package com.superc.kimserver.controller;

import com.superc.kimserver.common.ResultUtils;
import com.superc.kimserver.domain.UserInfo;
import com.superc.kimserver.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.superc.kimserver.repository.UserRepository;


/**
 * 小程序登录
 *
 * @Author: superC
 * @Date: 2018/11/11 20:03
 */
@RestController
@Api(value = "/login", tags = "小程序登录接口")
@RequestMapping("/login")
public class LoginController {

    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    /**
     * 登录
     */
    @RequestMapping(value = "/login")
    public ResultUtils login(@RequestParam(value = "username",required=false) String username,
                                 @RequestParam(value = "password",required=false)String password){

        UserInfo userInfo = userService.loginCheck(username, password);

        if(userInfo!=null){
            //存入session

            return ResultUtils.ok(userInfo);
        }else{
            return ResultUtils.errorMsg("账号/密码错误！");
        }
    }

}
