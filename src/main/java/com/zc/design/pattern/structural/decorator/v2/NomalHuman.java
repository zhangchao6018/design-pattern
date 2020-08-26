package com.zc.design.pattern.structural.decorator.v2;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class NomalHuman extends Human {
    String ability() {
        return "用脚走路";
    }

    int combatValue() {
        return 1;
    }
}
