package com.zc.design.pattern.structural.decorator.v2;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Superman extends AbstractHumanDecorator {
    public Superman(Human human) {
        super(human);
    }

    public String ability() {
        return super.ability()+",会攀岩走壁"+extra();
    }

    public int combatValue() {
        return super.combatValue()+97;
    }

    String extra() {
        return ",拯救了美国";
    }
}
