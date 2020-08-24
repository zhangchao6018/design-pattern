package com.zc.design.principle.interfacesegregation;

/**
 * 描述:
 * 实现类根据实际情况去实现职责分明的接口组,更加灵活
 * @Author: zhangchao
 **/
public class Dog implements  AnimalEatAction,AnimalSwinAction{
    public void eat() {
        System.out.println("狗吃");
    }

    public void swin() {
        System.out.println("狗刨");
    }
}
