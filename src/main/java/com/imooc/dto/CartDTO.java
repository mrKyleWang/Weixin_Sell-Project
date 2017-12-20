package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * @author Kyle.Wang
 * 2017/12/12 0012 19:43
 */
@Data
public class CartDTO {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
