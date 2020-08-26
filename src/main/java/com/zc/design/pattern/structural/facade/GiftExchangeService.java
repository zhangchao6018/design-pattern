package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class GiftExchangeService {

    private OrderService orderService = new OrderService();
    private StockService stockService = new StockService();
    private UserService userService = new UserService();

    public void exchangeGift(GiftDto giftDto){
        if (stockService.validStock(giftDto)){
            if (userService.validUser(giftDto)){
                orderService.createOrder(giftDto);
            }
        }
    }
}
