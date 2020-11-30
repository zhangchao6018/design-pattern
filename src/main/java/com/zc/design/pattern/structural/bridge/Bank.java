package com.zc.design.pattern.structural.bridge;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
