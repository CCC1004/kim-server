package com.superc.kimserver.controller;

import com.superc.kimserver.common.JsonUtils;
import com.superc.kimserver.common.ResultUtils;
import com.superc.kimserver.domain.KimIndexLb;
import com.superc.kimserver.service.WxIndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小程序首页
 * @Author: superC
 * @Date: 2018/11/13 22:09
 */
@RestController
@Api(value = "/index", tags = "小程序首页信息展示接口")
@RequestMapping("/index")
public class WxIndexController {

    Logger logger = LoggerFactory.getLogger(WxIndexController.class);

    @Autowired
    private WxIndexService wxIndexService;

    /**
     * 获取轮播图列表
     */
    @ApiOperation(value="轮播图列表", httpMethod="GET", notes="获取轮播图列表",response=String.class)
    @GetMapping("/getLbList")
    public ResultUtils getLbList(){
        ResultUtils result = new ResultUtils();
        List<KimIndexLb> list =  wxIndexService.getLbList();
        logger.info(list.toString());

        if(list!=null && list.size()>0){
            result = ResultUtils.ok(list);
        }else{
            result = ResultUtils.errorMsg("数据为空");
        }
        return result;
    }




}
