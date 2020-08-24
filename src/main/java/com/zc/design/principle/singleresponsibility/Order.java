package com.zc.design.principle.singleresponsibility;

/**
 * 描述:接口单一职责
 * 获取信息 + 管理(增删该) 夹杂到同一个接口 复杂度高
 * @Author: zhangchao
 **/
public interface Order {
    String getOrderById(String id);
    byte[] getOrderVideo();

    void createOrder();
    void refundOrder();
}
