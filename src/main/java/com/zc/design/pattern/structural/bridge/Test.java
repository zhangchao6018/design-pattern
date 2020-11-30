package com.zc.design.pattern.structural.bridge;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Bank bank1 = new ABCBank(new TimedAccount());
        Bank bank2 = new ABCBank(new DemandAccount());
        Bank bank3 = new ICBCBank(new TimedAccount());

        Account account1 = bank1.openAccount();
        account1.showAccount();
        System.out.println();
        Account account2 = bank2.openAccount();
        account2.showAccount();
        System.out.println();
        Account account3 = bank3.openAccount();
        account3.showAccount();
    }
}
