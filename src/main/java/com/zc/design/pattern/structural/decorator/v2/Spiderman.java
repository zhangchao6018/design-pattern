package com.zc.design.pattern.structural.decorator.v2;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Spiderman extends AbstractHumanDecorator {
    public Spiderman(Human human) {
        super(human);
    }

    public String ability() {
        return super.ability()+",会飞"+extra();
    }

    public int combatValue() {
        return super.combatValue()+98;
    }

    String extra() {
        return ",并且很会撩妹";
    }
}
