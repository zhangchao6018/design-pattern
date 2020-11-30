package com.zc.design.pattern.structural.adapter.objectadapter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new DC5V();
        adapter.outputElectricForPhone();
    }
}
