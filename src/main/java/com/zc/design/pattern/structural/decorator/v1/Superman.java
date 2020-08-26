package com.zc.design.pattern.structural.decorator.v1;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Superman extends Human {
    @Override
    public String ability() {
        return super.ability()+",可以飞";
    }

    @Override
    public int combatValue() {
        return super.combatValue()+98;
    }

}
