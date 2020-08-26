package com.zc.design.pattern.structural.decorator.v1;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Human human= new Human();
        Human spiderman = new Spiderman();
        Human superman = new Superman();
        System.out.println("human能力:"+human.ability()+",战斗力:"+human.combatValue());
        System.out.println("human能力:"+spiderman.ability()+",战斗力:"+spiderman.combatValue());
        System.out.println("human能力:"+superman.ability()+",战斗力:"+superman.combatValue());
    }
}
