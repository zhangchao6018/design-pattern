package com.zc.design.pattern.structural.decorator.v1;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Spiderman extends Human {
    @Override
    public String ability() {
        return super.ability()+",可以用蜘蛛丝飞行";
    }

    @Override
    public int combatValue() {
        return super.combatValue()+95;
    }
}
