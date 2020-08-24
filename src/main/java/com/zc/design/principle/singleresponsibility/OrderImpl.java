package com.zc.design.principle.singleresponsibility;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class OrderImpl implements OrderContent,OrderManager{
    public String getOrderById(String id) {
        return "这是"+id+"的课程名称";
    }

    public byte[] getOrderVideo() {
        return new byte[0];
    }

    public void createOrder() {
        System.out.println("创建了订单");
    }

    public void refundOrder() {
        System.out.println("订单退款");
    }
}
