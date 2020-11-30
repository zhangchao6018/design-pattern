package com.zc.design.pattern.structural.bridge;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("准备开户");
        account.openAccount();
        return account;
    }
}
