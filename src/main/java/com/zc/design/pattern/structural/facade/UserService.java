package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class UserService {
    public boolean validUser(GiftDto giftDto){
        String userId = giftDto.userId;
        System.out.println("userId"+userId+"用户校验通过...");
        return true;
    }
}
