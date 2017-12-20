package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * 自定义异常
 *
 * @author Kyle.Wang
 * 2017/12/12 0012 11:33
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
