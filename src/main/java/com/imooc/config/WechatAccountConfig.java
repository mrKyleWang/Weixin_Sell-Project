package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Kyle.Wang
 * 2017/12/20 0020 16:53
 */
@Data
@Component
@ConfigurationProperties(prefix = "wxchat")
public class WechatAccountConfig {

    /**
     * 公众号appId
     */
    private String appId;

    /**
     * 公众号appSecret
     */
    private String appSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;



}
