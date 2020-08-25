package com.zc.design.pattern.creational.abstractfactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public interface Computer {

    Mouse createMouse();

    KeyBoard createKeyBoard();
}
