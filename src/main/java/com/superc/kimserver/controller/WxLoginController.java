package com.superc.kimserver.controller;

import com.superc.kimserver.common.HttpClientUtil;
import com.superc.kimserver.common.IMoocJSONResult;
import com.superc.kimserver.common.JsonUtils;
import com.superc.kimserver.models.WxSessionModel;
import com.superc.kimserver.properties.WxInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信登录
 *
 * @Author: superC
 * @Date: 2018/11/9 11:40
 */
@RestController
@RequestMapping("/wxLogin")
public class WxLoginController {

    @Autowired
    private WxInfoProperties wxInfoProperties;

    /**
     * 测试是否整合成功
     */
    @RequestMapping(value = "/test")
    public String testZH() {
        return "工程整合成功！！！";
    }

    /**
     * 微信登录
     */
    @PostMapping(value = "/wxLogin")
    public IMoocJSONResult wxLogin(@RequestParam("code") String code) {

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
        WxSessionModel model = JsonUtils.jsonToPojo(wxResult, WxSessionModel.class);

        // 存入session到redis


        return IMoocJSONResult.ok();

    }

}
