package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kyle.Wang
 * 2017/12/13 0013 19:41
 */
@RestController
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @GetMapping("/authorize")
    public void authorize(@RequestParam("returnUrl") String returnUrl){

//        WxMpService wxMpService= new WxMpServiceImpl();
//        //1.配置
//        //2.调用方法
//        wxMpService
    }
}
