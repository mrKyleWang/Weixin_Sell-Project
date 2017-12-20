package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 手动获取用户openid
 * @author Kyle.Wang
 * 2017/12/20 0020 15:47
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    private String appid ="wx70366a10cb72ea99";
    private String appsecret ="a8bf30aeba88de15e0cafcf9c6e86c6a";

    /**
     * 用户授权(手动)
     */
    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code,@RequestParam("state") String state){
        log.error("进入auth方法");
        log.error("code:{}",code);
        log.error("state:{}",state);

        String url= "https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appid+"&secret="+appsecret+"&code="+code+"&grant_type=authorization_code";

        //发送get请求,通过Code获取access_token
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.error("response={}",response);
    }
}
