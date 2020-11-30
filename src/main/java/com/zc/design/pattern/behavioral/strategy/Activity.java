package com.zc.design.pattern.behavioral.strategy;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Activity {
    private Strategy strategy;

    public Activity(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeActivity(){
        strategy.doAction();
    }
}
