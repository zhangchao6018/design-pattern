package com.zc.design.principle.interfacesegregation;

/**
 * 描述:
 * 如果定义成AnimalAction这样,发现实现类会有很多空实现,不利于程序可读\扩展
 * @Author: zhangchao
 **/
public class Bird implements AnimalAction {

    public void eat() {
        System.out.println("鸟吃");
    }

    //鸟不一定能飞--不得不置空
    public void fly() {

    }

    //鸟不一定能有用--不得不置空
    public void swin() {

    }
}
