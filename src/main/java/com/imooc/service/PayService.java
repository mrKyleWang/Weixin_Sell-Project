package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 支付
 * @author Kyle.Wang
 * 2017/12/20 0020 21:02
 */

public interface PayService {
    void create(OrderDTO orderDTO);
}
