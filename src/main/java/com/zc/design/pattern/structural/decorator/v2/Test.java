package com.zc.design.pattern.structural.decorator.v2;

/**
 * 描述:
 * Human相当于是最原始的抽象类,NomalHuman是其继承者
 * 我们现在NomalHuman基础上有新的需求,但是不想改动NomalHuman源码
 * 因此新定义了一个抽象类,继承Human,其内部用顶层抽象类包装一层,作为构造传入(
 * 使用方法则为
 *  nomalHuman = new Spiderman(nomalHuman);
 *  包装一层
 *  具体装饰的新功能可以在AbstractHumanDecorator继承者中写
 *
 *  并且AbstractHumanDecorator可以定义顶层抽象接口没有的新增功能
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Human nomalHuman = new NomalHuman();
        nomalHuman = new Spiderman(nomalHuman);
        nomalHuman = new Superman(nomalHuman);

        System.out.println("能力:"+nomalHuman.ability()+",战斗力:"+nomalHuman.combatValue());

    }
}
