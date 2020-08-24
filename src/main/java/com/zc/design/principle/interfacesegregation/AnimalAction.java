package com.zc.design.principle.interfacesegregation;

/**
 * 描述:
 * 错误的设计: 将职责功能截然不同的方法定义在同一接口
 * @Author: zhangchao
 **/
public interface AnimalAction {
    void eat();

    void fly();

    void swin();
}
