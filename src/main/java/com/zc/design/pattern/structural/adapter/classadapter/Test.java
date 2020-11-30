package com.zc.design.pattern.structural.adapter.classadapter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.rquest();
    }
}
