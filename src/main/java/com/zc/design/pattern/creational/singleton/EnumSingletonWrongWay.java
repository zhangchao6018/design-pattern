package com.zc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 描述:--错误的写法--不能抵御序列化
 *
 * @Author: zhangchao
 **/
public class EnumSingletonWrongWay implements Serializable {
    private EnumSingletonWrongWay() {
    }

    private enum ContainerHolder {
        INSTANCE;
        EnumSingletonWrongWay enumSingletonWrongWay;
        ContainerHolder() {
            this.enumSingletonWrongWay = new EnumSingletonWrongWay();
        }

    }

    public static EnumSingletonWrongWay getInstance(){
        return ContainerHolder.INSTANCE.enumSingletonWrongWay;
    }

}
