package com.zc.design.pattern.structural.decorator.v2;

/**
 * 描述:
 * 这个想打
 *
 * @Author: zhangchao
 **/
public abstract class AbstractHumanDecorator extends Human {
    private Human human;

    public AbstractHumanDecorator(Human human) {
        this.human = human;
    }

    @Override
    String ability() {
        return human.ability();
    }

    @Override
    int combatValue() {
        return human.combatValue();
    }

    abstract String extra();
}
