package com.zc.design.pattern.structural.facade;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class GiftDto {
    String userId;

    String giftId;

    String giftName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
}
