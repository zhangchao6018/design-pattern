package com.zc.design.pattern.structural.adapter.classadapter;

/**
 * 描述:
 * 被适配的类(早已完成,但是不匹配新的接口)
 * @Author: zhangchao
 **/
public class Adaptee {
    public void doSomething(){
        System.out.println("被适配者的方法");
    }
}
