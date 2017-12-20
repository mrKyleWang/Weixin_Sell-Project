package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author Kyle.Wang
 * 2017/12/12 0012 10:01
 */
@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
