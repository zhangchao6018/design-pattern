package com.zc.design.pattern.creational.abstractfactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class LogicComputer implements Computer {
    public Mouse createMouse() {
        return new LogicMouse();
    }

    public KeyBoard createKeyBoard() {
        return new LogicKeyBoard();
    }
}
