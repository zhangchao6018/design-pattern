package com.zc.design.pattern.structural.adapter.objectadapter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class DC5V implements Adapter {

    private AC220V aC220V = new AC220V();
    public int outputElectricForPhone() {
        //民用电
        int i = aC220V.outputElectric220();

        //变压器变压
        System.out.println("经过变压器变压");
        int phoneResult = i/44;
        System.out.println("返回"+phoneResult+"v手机用电");
        return phoneResult;

    }
}
