package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class StockService {

    public boolean validStock(GiftDto giftDto){
        System.out.println("礼品id:"+giftDto.giftId+"校验通过...");
        return true;
    }
}
