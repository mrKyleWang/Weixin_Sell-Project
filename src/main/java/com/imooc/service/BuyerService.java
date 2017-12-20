package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author Kyle.Wang
 * 2017/12/13 0013 17:51
 */
public interface BuyerService {

    /**
     * 查询一条订单
     * @param openid
     * @param orderId
     * @return
     */
    public OrderDTO findOrderOne(String openid,String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    public OrderDTO cancelOrder(String openid,String orderId);

}
