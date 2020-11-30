package com.zc.design.pattern.structural.bridge;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class TimedAccount extends Account {
    void openAccount() {
        System.out.println("开启账户成功...");
    }

    void showAccount() {
        System.out.println("这是定期账户...");
    }
}
