package com.imooc.utils;

import java.util.Random;

/**
 * @author Kyle.Wang
 * 2017/12/12 0012 18:57
 */
public class KeyUtil {
    /**
     * 生成唯一主键
     * 格式:时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        //生成6位随机数
        Integer a = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(a);
    }
}
