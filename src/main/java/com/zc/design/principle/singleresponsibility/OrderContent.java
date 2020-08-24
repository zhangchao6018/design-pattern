package com.zc.design.principle.singleresponsibility;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public interface OrderContent {
    String getOrderById(String id);
    byte[] getOrderVideo();
}
