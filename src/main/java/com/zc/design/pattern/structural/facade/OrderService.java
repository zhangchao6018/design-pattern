package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class OrderService {

    public String createOrder(GiftDto giftDto){
        System.out.println("生成订单成功...");
        return Math.random()*1000+"";
    }

}
