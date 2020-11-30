package com.zc.design.pattern.behavioral.strategy;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Activity activity1111 = new Activity(new The1111Strategy());
        Activity activity618 = new Activity(new The618Strategy());
        activity1111.executeActivity();
        activity618.executeActivity();
    }
}
