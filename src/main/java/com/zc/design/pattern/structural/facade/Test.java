package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        GiftDto giftDto = new GiftDto();
        giftDto.setGiftName("mac电脑");
        giftDto.setGiftId("gift10001");
        giftDto.setUserId("user001");
        giftExchangeService.exchangeGift(giftDto);
    }
}
