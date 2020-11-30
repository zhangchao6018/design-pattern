package com.zc.design.pattern.structural.adapter.classadapter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Adapter extends Adaptee implements Target {
    public void rquest() {
        System.out.println("新接口功能1");
        super.doSomething();
        System.out.println("新接口功能2");
    }
}
