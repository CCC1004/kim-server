package com.superc.kimserver.controller;

import com.superc.kimserver.common.HttpClientUtil;
import com.superc.kimserver.common.ResultUtils;
import com.superc.kimserver.common.JsonUtils;
import com.superc.kimserver.models.WxSessionModel;
import com.superc.kimserver.properties.WxInfoProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信登录
 *
 * @Author: superC
 * @Date: 2018/11/9 11:40
 */
@RestController
@Api(value = "/wxLogin", tags = "小程序微信登录接口")
@RequestMapping("/wxLogin")
public class WxLoginController {

    Logger logger = LoggerFactory.getLogger(WxLoginController.class);

    @Autowired
    private WxInfoProperties wxInfoProperties;

    /**
     * 测试是否整合成功
     */
    @ApiOperation(value="测试项目", httpMethod="GET", notes="测试项目是否整合成功",response=String.class)
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testZH() {
        return "工程整合成功！！！";
    }

    /**
     * 微信登录
     */
    @RequestMapping(value = "/wxLogin")
    public ResultUtils wxLogin(@RequestParam("code") String code) {

        System.out.println("wxlogin - code: " + code);

        String url = wxInfoProperties.getUrl();
        Map<String, String> param = new HashMap<>();
        param.put("appid", wxInfoProperties.getAppid());
        param.put("secret", wxInfoProperties.getSecret());
        param.put("js_code", code);
        param.put("grant_type", wxInfoProperties.getGrant_type());

        String wxResult = HttpClientUtil.doGet(url, param);
        System.out.println("json串：  " + wxResult);

//        转换为json对象
//        WxSessionModel model = JsonUtils.jsonToPojo(wxResult, WxSessionModel.class);

        // 存入session到redis


        return ResultUtils.ok();

    }

}
